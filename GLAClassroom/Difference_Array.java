// Create the function that accepts an integer array ‘arr’, its length and two integer variables ‘num’ and ‘diff’. Implement this function to find and return the number of elements of ‘arr’ having an absolute difference of less than or equal to ‘diff’ with ‘num’. Note: In case there is no element in ‘arr’ whose absolute difference with ‘num’ is less than or equal to ‘diff’, return -1.

// Input Format

// size of array input array two integers num and diff

// Constraints

// 1

// Output Format

// print count of elements of ‘arr’ having absolute difference of less than or equal to ‘diff’

// Sample Input 0

// 6
// 12 3 14 56 77 13
// 13
// 2
// Sample Output 0

// 3
import java.io.*;
import java.util.*;

public class Difference_Array {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int a=sc.nextInt();
        int b=sc.nextInt();
        int ans=re(arr,a,b);
        System.out.print(ans);
    }
    static int re(int[] arr,int a,int b){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(Math.abs(arr[i]-a)<=b){
                count++;
            }
        }
        return count;
    }
}