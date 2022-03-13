import java.util.Scanner;

// 23. Input a number and print all the factors of that number (use loops).
public class Factors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                if((i*j)==n)
                {
                    System.out.println(i + " * " + j);
                }
            }
        }
    }
}
