package Tree;

public class Computer implements Comparable<Computer>{
    int val;

    public Computer(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    @Override
    public int compareTo(Computer c) {
         if(val > c.val) {
             return -1;
         } else if (val < c.val) {
             return 1;
         } else {
             return 0;
         }
    }

    @Override
    public String toString() {
        return "val:" + val;
    }
}
