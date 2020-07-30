package Runnerble;

public class Circle implements PrintArea {
    private int num;

    public double printArea() {
        return num * num * Math.PI;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
