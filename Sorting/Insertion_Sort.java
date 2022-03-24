import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr={5,9,8,6,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j-1]>arr[j]){
                    swap(arr,j-1,j);
                }
                else
                {
                    break;
                }
            }
        }
    }

static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    static void printing(int[] arr){
        for(int k=0;k<arr.length;k++)
        {
            System.out.println(arr[k]);
        }
    }

}
