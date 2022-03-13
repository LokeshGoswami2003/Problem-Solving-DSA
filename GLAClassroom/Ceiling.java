import java.util.Scanner;

public class Ceiling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i:arr)
        {
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int ans=BinaryCeiling(arr,target);
        System.out.println(ans);
    }
    static int BinaryCeiling(int arr[],int target){                       // 1 2 3 4 5 6
        int start=0;
        int end=arr.length-1;
        int mid;
        while(start<end)
        {
            mid=(start+end)/2;
            if(arr[mid]>target)
            {
                end=mid-1;
            }
            else if(arr[mid]<target)
            {
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    
}
