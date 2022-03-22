import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

// 4. Take in two numbers and an operator (+, -, *, /) and calculate the value.
// (Use if conditions)
public class Calculate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        char ch=sc.next().charAt(0);
        b=sc.nextInt();
        int evaluation;
        
        if(ch=='+')
        {
            System.out.println(a+b);
        }
        else if(ch=='-')
        {
            System.out.println(a-b);  
        }
        else if(ch=='*')
        {
            System.out.println(a*b);   
        }
        else if(ch=='/')
        {
            System.out.println(a/b);   
        }
        else 
        {
            System.out.println("Invalid sysmbol");
        }
        
    }
    
}
