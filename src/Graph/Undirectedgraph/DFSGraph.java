package Graph.Undirectedgraph;

import Graph.Node;

import java.util.ArrayList;
import java.util.HashMap;

public class DFSGraph {

    private HashMap <Node, Node> visited = new HashMap<>();
    public Node cloneGraph(Node node) {
      if(node == null) {
          return node;
      }

      if(visited.containsKey(node))
          return visited.get(node);

      Node clonenode = new Node(node.val, new ArrayList<Node>());

      visited.put(node, clonenode);

      for(Node neighbor : node.neighbors) {
          clonenode.neighbors.add(cloneGraph(neighbor));
      }

      return clonenode;
    }

}
