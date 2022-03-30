public class Sorted_Or_Not {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,0};
        boolean ans = is_sorted(arr);
        System.out.println(ans);
    }
    static boolean is_sorted(int[] arr){
        return clone(arr,0);
    }
    static boolean clone(int[] arr,int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<=arr[index+1] && clone(arr, ++index);
    }
}
