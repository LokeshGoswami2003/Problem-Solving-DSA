import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int sum=0;
        
        while(true)
        {
            System.out.print("Enter the Number: ");
            int temp= sc.nextInt();
            sum=sum+temp;
            System.out.print("Press x for the the output or any other charecter for add another number: ");
            char tem=sc.next().charAt(0);
            if(tem=='x' || tem=='X')
            {
                break;
            }
            
        }
        System.out.print("The Sum is: "+sum);

    }
}
