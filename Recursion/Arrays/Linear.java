import java.lang.annotation.Target;

public class Linear {
    public static void main(String[] args) {
        int[] arr={1,3,5,12,4,55,34};
        int item=84;
        int index=search(arr,item);
        System.out.println(index);

    }
    static int search(int[] arr,int target){
        return clone(arr,target,0);
    }
    static int clone(int[] arr,int target,int index){
        if(arr[index]==target){
            return index;
        }
        if(index==arr.length-1){
            return -1;
        }
        return clone(arr, target, ++index);
    }
    
}
