// Printing first N natural numbers using recursion

public class Print_N_Numbers {
    public static void main(String[] args) {
        int n = 5;
        print(n);

    }

    static void print(int n) {
        if (n == 0) {          // Base condition
            return;
        }
        print(n - 1);
        System.out.println(n);
    }
}
