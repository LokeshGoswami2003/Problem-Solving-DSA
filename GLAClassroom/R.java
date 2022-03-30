import java.util.Arrays;

public class R{
    public static void main(String[] args) {
        int[] arr={1,2,3,9,5,4,7,6,20,11};
       int  mid=arr.length/2;
        int[] b=Arrays.copyOfRange(arr, 5,10);
        // int[] c=Arrays.copyOfRange(arr, mid,arr.length);
        System.out.println(Arrays.toString(b));
        // System.out.println(Arrays.toString(c));
        System.out.println(arr.length);
    }
}