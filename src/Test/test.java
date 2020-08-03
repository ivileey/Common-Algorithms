package Test;

import Sort.Insertion.insertSort;
import Sort.Select.Select;
import Sort.exchange.Exchange;
import Sort.merge.Merge;

import java.util.*;

public class test {
    public static void main(String[] args){
        //List<Object> list = new ArrayList<>();
        //List<Object> list = new LinkedList<>();

//        list.add(1);
//        list.add(2);
//        list.add(null);

//        Set<Object> set = new HashSet<>();
        //Set<Object> set = new LinkedHashSet<>();
//        Set<Object> set = new TreeSet<>();

//        set.add(1);
//        set.add(2);
//        set.add(null);

        Map<Object,Object> map = new Hashtable<>();
        map.put(1,1);
        map.put(3,null);

        Set<Map.Entry<Object,Object>> set = map.entrySet();
        Iterator<Map.Entry<Object,Object>> iterator = set.iterator();

        while(iterator.hasNext())
        {
            Map.Entry<Object,Object> entry = iterator.next();
            System.out.println(entry.getKey());
        }

        for(Object i : set) {
            System.out.println(i);
        }
    }
}
