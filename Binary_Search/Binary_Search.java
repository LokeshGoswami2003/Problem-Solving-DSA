import java.util.Scanner;
public class Binary_Search{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        System.out.println("element found on position");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int element=sc.nextInt();
        int start=0;
        int end=arr.length-1;
        int mid;
        while(start<=end){
            mid=(start+end)/2;
            if(arr[mid]==element){
                System.out.println("element found on index "+mid);
                break;
            }
            if(arr[mid]<element){
                start=mid+1;
            }
            if(arr[mid]>element){
                end=mid-1;
            }                      //0 1 2 3 4 5 6 7 8 9
            
        }
        if(start>end){
            System.out.println("not get");
        }
        return;
    }
    //     while(start<=end){
    //         mid=(start+ (end-start))/2;
    //         if(arr[mid]==element)
    //         {
    //          System.out.println("element found on position");   
    //          break;
    //         }
    //     }
    //     System.out.println("element found on position");
    // }
    // // static void binary(int ceiling_element , int[] arr)
    // // {
      
    //     }
    // }

}
