import java.util.Scanner;

// 8. To find out whether the given String is Palindrome or not.
public class String_Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int j=s.length();
        int start=0;
        int end=j-1;
        int flag=0;
        
        while(start<end)
        {
        
            if(s.charAt(start)==s.charAt(end))
            {
                
            }
            else
            {
                flag=1;
                break;
            }
            start++;
            end--;

            
        }
        if(flag==0)
        {
            System.out.println("Palindrome");
        }
        else
        {
        System.out.println("Not Palindrome");
        }
    }
    
}
