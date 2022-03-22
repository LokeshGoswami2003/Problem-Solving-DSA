import java.util.Scanner;

// 17. Reverse A String In Java
public class String_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int end = s.length() - 1;

        while (end > -1) {
            System.out.print(s.charAt(end) + " ");
            end--;

        }
    }
}
