import java.io.OutputStream;
import java.util.Scanner;

// 3. Write a program to input principal, time, and rate (P, T, R) from the user and
// find Simple Interest.
public class Interest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int p,t,r;
        System.out.println("Enter Principal Time and Rate respectively");
        p=sc.nextInt();
        t=sc.nextInt();
        r=sc.nextInt();
        int amount=p*(1+r*t);
        System.out.println(amount);
    }
}
