import java.util.Arrays;

public class Merge_Sort {
    public static void main(String[] args) {
        int[] arr={1,2,3,9,5,4,7,6,20,11};
        arr=mergesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergesort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left = mergesort(Arrays.copyOfRange(arr, 0, mid));
        int[] right=mergesort(Arrays.copyOfRange(arr, mid, arr.length));
        return mergetwo(left,right);
    }

    static int[] mergetwo(int[] first,int[] second){
        int[] merged=new int[first.length+second.length];
        int fi=0;
        int si=0;
        int mi=0;

        while(fi<first.length && si<second.length){
            if(first[fi]<=second[si]){
                merged[mi]=first[fi];
                fi++;
            }
            else if(first[fi]>second[si]){
                merged[mi]=second[si];
                si++;
            }
            mi++;
        }

        while(fi!=first.length){
            merged[mi]=first[fi];
            mi++;
            fi++;
        }

        while(si!=second.length){
            merged[mi]=second[si];
            mi++;
            si++;
        }

        return merged;
    }
}
