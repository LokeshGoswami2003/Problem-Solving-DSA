import java.util.Scanner;

import java.util.*;
public class Consecutive_Array
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n+1];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }                                     // 10 10 30 30 40 50 50 50 9 45
        arr[n+1]=0;
        int temp=0;
        for(int i=1;i<n;i++)
        {   
            if(arr[i]==arr[i-1])
            {
                for(int j=i;j<n;j++)
                {
                    arr[j]=arr[j+1];
                }
                temp++;
            }
        }
        for(int i=0;i<n-1-temp;i++)
        {
            System.out.println(arr[i]);
        }                       

    }
}