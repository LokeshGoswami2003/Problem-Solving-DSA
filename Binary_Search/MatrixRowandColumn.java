public class MatrixRowandColumn {
    public static void main(String[] args) {
        int[][] matrix={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        MatrixSearch ss=new MatrixSearch();
        int[] arr=ss.Searchh(matrix,9);
        for(int k=0;k<arr.length;k++)
        {
            System.out.println(arr[k]);
        }
    }
}

class MatrixSearch {
    public int[] Searchh(int[][] matrix , int element)
    {   
        int start=0;
        int end=matrix.length-1;
        while(start<matrix.length && end >=0)
        {
        if(matrix[start][end]==element)
        {
            return new int[]{start,end};
        }
        if(matrix[start][end]>element)
        {
            end--;
        }
        else
        {
            start++;
        }
    }
    return new int[]{-1,-1};
}

}