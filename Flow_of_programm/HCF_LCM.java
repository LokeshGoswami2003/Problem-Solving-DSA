import java.util.Scanner;

public class HCF_LCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int gcd=0;
        int max=0;
        if(a>b)
        {
            max=a;
        }
        else
        {
            max=b;
        }
        while(gcd==0)
        {
            if(max%a==0 && max%b==0)
            {
                gcd=max;
            }
            else
            {
                max++;
            }
        }
        int lcm=(a*b)/gcd;
        int hcf=(a*b)/lcm;
        System.out.println("LCM is "+ lcm);
        System.out.println("HCF is "+ hcf);
    }
}
