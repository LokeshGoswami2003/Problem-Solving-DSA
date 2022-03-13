import java.util.*;
public class Stock {
    int arr[];
    int top;
    Stock(){
        arr=new int[5];
        top=-1;
    }
    void push(){
        if(top>=arr.length-1)
        {
            System.out.println("stack full/overflow");
        }
        else
        {
            Scanner sc2=new Scanner(System.in);
            int data;
            System.out.println("enter data");
            data=sc2.nextInt();
            top=top+1;
            arr[top]=data;    
            System.out.println("data inserted");
        }
    }
    void pop(){
        if(top==-1){
        System.out.println("stack empty / underflow");
        }
        else{
            System.out.println("data deleted:" + arr[top]);
            top=top-1;
            
        }
    }
    void view(){
        if(top==-1)
        {
            System.out.println("Stack empty / underflow  ");
        }
        else
        {
            System.out.println("stack elements are");
            for(int i=top;i>=0;top--)
            {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        Stock obj=new Stock();
        while(true){
            System.out.println("\npress 1 for push");
            System.out.println("press 2 for pop");
            System.out.println("press 3 for view");
            System.out.println("press 4 for exit");
            
            System.out.println("Enter your choise");

            Scanner sc= new Scanner(System.in);

            int choise=sc.nextInt();

            switch (choise){
                case 1:
                obj.push();
                break;
                case 2:
                obj.pop();
                break;
                case 3:
                obj.view();
                break;
                case 4:
                System.exit(0);
                break;
                default:
                System.out.println("wrong choize");

            }
        }
    }
    
}
