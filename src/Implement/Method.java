package Implement;

import java.util.*;

public class Method {

    public static void printCircle(Circle c)
    {
        System.out.println(c.printArea());
    }

    public static void printSqure(Squre s)
    {
        System.out.println(s.printArea());
    }

    public static void print(PrintArea pa)
    {
        System.out.println(pa.printArea());
    }

    public static void main(String[] args) {
//        Circle circle = new Circle();
//        circle.setNum(23);
//
//        Squre squre = new Squre();
//        squre.setNum(23);
//
//        printCircle(circle);
//        printSqure(squre);
//
//        print(circle);
//        print(squre);

//        List<Integer> list = new ArrayList();
//        Iterator<Integer> it;
//
//        Set<Integer> set = new HashSet<>();
//        set.add(1);
//        set.add(1);
//        set.add(2);
//        set.add(5);
//        set.add(3);
//        it = set.iterator();
//        while(it.hasNext())
//        {
//            System.out.println(it.next());
//        }
        LinkedHashSet a;

        HashMap<String,Integer> map = new HashMap<String,Integer>();
        map.put("语文", 1);
        map.put("数学", 2);
        map.put("英语", 3);
        map.put("历史", 4);
        map.put("政治", 5);
        map.put("地理", 6);
        map.put("生物", 7);
        map.put("化学", 8);

        for(Map.Entry<String,Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
