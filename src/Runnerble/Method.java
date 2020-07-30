package Runnerble;

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
        Circle circle = new Circle();
        circle.setNum(23);

        Squre squre = new Squre();
        squre.setNum(23);

        printCircle(circle);
        printSqure(squre);

        print(circle);
        print(squre);

    }
}
