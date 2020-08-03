package Implement;

public class Squre implements PrintArea{
    private long num;

    @Override
    public double printArea() {
       return num * num;
    }

    public long getNum() {
        return num;
    }

    public void setNum(long num) {
        this.num = num;
    }
}
