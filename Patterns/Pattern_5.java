// 5.  *
//     **
//     ***
//     ****
//     *****
//     ****
//     ***
//     **
//     *

public class Pattern_5 {
    public static void main(String[] args) {
        int n = 5;
        int k = n - 1;
        for (int i = 1; i <= (2 * n) - 1; i++) {
            if (i <= n) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 1; j <= k; j++) {
                    System.out.print("*");

                }
                k--;
            }
            System.out.println();
        }
    }
}
