public class Element_Not_Repeate{
    public static void main(String[] args) {       //only one element not repeate twice
        int[] arr = {1,2,3,1,2,3,8,9,9};
        int ans=element(arr);
        System.out.println(ans);
    }
    static int element(int[] arr){
        int value=0;
        for(int i=0;i<arr.length;i++){
            value=value^arr[i];
        }
        return value;
    }
}