import java.util.*;
class Sort{
    public void Return_Array(int[] arr){
        int temp=0;
        int min=0;
        for (int i=0;i<arr.length-1;i++){
            min = arr[i];
            for(int j=i+1;j<arr.length;j++){       //  9 8 7 6 5 4 3 2 1 0
                if(arr[j]<min)
                {   temp=min;
                    min=arr[j];
                    arr[j]=temp;

                }
            }
            arr[i]=min;
        }

    }
    public void printing(int[] arr){
        for(int k=0;k<arr.length;k++)
        {
            System.out.println(arr[k]);
        }
    }
}

public class Selection_Sort{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[] arr=new int [10];
    System.out.println("Enter the elements 0-9 : ");
    for(int i=0;i<arr.length;i++)
    {
        arr[i]=sc.nextInt();
    }
    System.out.println("the sorted non decreasing array is : ");
    Sort ss=new Sort();
    ss.Return_Array(arr);
    ss.printing(arr);    
  }  
}


