package Tree;

import java.util.Iterator;
import java.util.TreeSet;

public class Method {
    public static void main(String[] args) {
        Computer c1 = new Computer(1);
        Computer c2 = new Computer(19);
        Computer c3 = new Computer(5);
        TreeSet<Computer> treeSet = new TreeSet<>();
        treeSet.add(c1);
        treeSet.add(c2);
        treeSet.add(c3);

        for(Computer c: treeSet) {
            System.out.println(c);
        }
    }
}
