package Dynamic.Steelbarcutting;

//自低向上的动态规划
public class Steelbarcutting3 {
    private int[] price;
    private int[] r;

    Steelbarcutting3() {
        price = new int[]{1,5,8,9,10,17,17,20,24,30};
        r = new int[11];
    }

    private int cut_rod(int n) {
        int q = 0;
        r[0] = 0;
        for(int j = 1; j <= n; j++) {
            for(int i = 1; i <= j; i++) {
                q = Math.max(q,price[i - 1] + r[j - i]);
            }
            r[j] = q;
        }
        return r[n];
    }

    public static void main(String[] args) {
        Steelbarcutting3 steelbarcutting1 = new Steelbarcutting3();
        System.out.println(steelbarcutting1.cut_rod(8));
    }
}
