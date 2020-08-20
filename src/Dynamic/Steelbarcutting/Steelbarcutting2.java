package Dynamic.Steelbarcutting;

//使用动态规划的方式切割钢条
//自顶向下的动态规划
public class Steelbarcutting2 {
    private int[] price;
    private int[] r;
    Steelbarcutting2() {
        price = new int[]{1,5,8,9,10,17,17,20,24,30};
        r = new int[10];
    }

    private int cut_rod(int n) {
        int q = 0;
        if (r[n] > 0 )
            return r[n];
        if(n == 0) {
            q = 0;
        }
        for(int i = 1; i <= n; i++) {
            q = Math.max(q,price[i - 1] + cut_rod(n -i));
        }
        r[n]=q;
        return q;
    }

    public static void main(String[] args) {
        Steelbarcutting2 steelbarcutting2 = new Steelbarcutting2();
        System.out.println(steelbarcutting2.cut_rod(7));
    }
}
