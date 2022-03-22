import java.util.*;
public class Leap_Year
{
    public static void main(String[] args) 
    {
        int year;
        Scanner take=new Scanner(System.in);
        year=take.nextInt();
        if(year%100==0)
        {
            System.out.println("Leap year");
        }
        else if(year%4==0)
        {
            System.out.println("Leap year"); 
        }
        else
        {
            System.out.println("Not a Leap year");
        }

        
    }
}