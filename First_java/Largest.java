import java.util.Scanner;

// 5. Take 2 numbers as input and print the largest number.
public class Largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b)
        System.out.println(a);
        else
        System.out.println(b);
    }
    
}
