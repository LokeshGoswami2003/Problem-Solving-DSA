public class Binary_Search_Recursion {
    public static void main(String[] args) {
        int[] arr={1,5,6,7,9,10,12,45,65,98};
        int pos_binary=search(arr, 0, arr.length-1, 1111);
        System.out.println("The Given Element Found on Index "+pos_binary);
    }

    static int search(int[] arr, int start, int end, int target ){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]>target){
            return search(arr, start, mid-1, target);
        }
        if(arr[mid]<target){
        return search(arr, mid+1, end, target);
        }
        return -1;
    }
}
