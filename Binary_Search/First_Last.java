import java.util.Scanner;
class Find{
    public int[] findfirstandlast(int[] arr , int target){
        int start=0;
        int end=arr.length-1;
        int mid;
        while(start<=end){
            mid=(start+end)/2;
            if(arr[mid]==target && arr[start]==arr[end]){
                break;
            }
            if(arr[mid]<target){
                start=mid+1;
            }
            if(arr[mid]>target){
                end=mid-1;
            }                      //0 1 2 3 4 5 6 7 8 9
            
        }
        return new int[] {start,end};
        // if(start>end){
        //     System.out.println("not get");
        // }
    }
}
public class First_Last{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        System.out.println("Enter array of size 10");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter element: \n");
        int element=sc.nextInt();
        // int[] val=new int[1];
        Find ss=new Find();
        System.out.println(ss.findfirstandlast(arr, element)); 
        // System.out.println(arr.toString());
    }
}
