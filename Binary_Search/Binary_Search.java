import java.util.Scanner;
class Search{
    public void return_Search(int[] arr , int element)
    {
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
    }
}
public class Binary_Search{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        System.out.println("Enter the elements 0-9 : ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.err.println("enter the element to be search");
        int element=sc.nextInt();
        Search ss= new Search();
       ss.return_Search(arr, element);
        
        
    }


}
