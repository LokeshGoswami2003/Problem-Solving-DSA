import java.util.Scanner;

// 7. To calculate Fibonacci Series up to n numbers. 
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1;                    
        int sum=0;
        System.out.print(a+" "+b+" "); 
        for(int i=1 ; i<=n-2 ; i++)  
        {
            sum=a+b;
            a=b;             
            b=sum;
            
            System.out.print(sum +" ");
            
        }
    }
}
