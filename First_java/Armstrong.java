import java.util.Scanner;

// To find Armstrong Number between two given number.
public class Armstrong {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int sum,rem=0;
    for (int i=a;i<=b;i++)
    {   
        sum=0;
        int temp=i;
        while(temp!=0)
        {
            rem=temp%10;
            sum=sum+(rem*rem*rem);
            temp=temp/10;
        }
        if(sum==i)
        {
            System.out.println(i);
        }

    }
    }
}
