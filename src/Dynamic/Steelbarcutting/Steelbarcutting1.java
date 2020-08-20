package Dynamic.Steelbarcutting;

//使用普通的方法来计算钢条切割的最优切割方案
public class Steelbarcutting1 {
    private int[] price;

    Steelbarcutting1() {
        price = new int[]{1,5,8,9,10,17,17,20,24,30};
    }

    private int cut_rod(int n){
        int q = 0;
        if(n == 0)
            return 0;

        for(int i = 1; i <= n; i++) {
            q = Math.max(q,price[i - 1] + cut_rod(n - i));
        }
        return q;
    }

    public static void main(String[] args) {
        Steelbarcutting1 steelbarcutting1 = new Steelbarcutting1();
        System.out.println(steelbarcutting1.cut_rod(9));
    }
}
