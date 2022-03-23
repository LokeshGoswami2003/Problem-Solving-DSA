import java.util.*;

class MatrixSearch {
    public int[] Searchh(int[][] matrix, int element) {

        int rows = matrix.length;
        int cols = matrix[0].length;
        // if there is only one row in the matrix
        if (cols == 0){
            return new int[] {-1,-1};
        }
        if (rows == 1) {
            return binary_search(matrix, 0, 0, cols - 1, element);
        }

        // run till two rows are remaining

        int rstart = 0;
        int rend = rows-1;
        int midc = cols / 2;
        while (rstart < (rend-1)) {
            int midr = rstart + (rend - rstart) / 2;
            if (matrix[midr][midc] == element) {
                return new int[]{midr,midc};
            }
            if (matrix[midr][midc] < element) {
               rstart = midr; 
            } else {
                rend = midr;
            }
        }
        // check for mid column
        if (matrix[rstart][midc] == element) {
            return new int[]{ rstart, midc };
        }
        if (matrix[rstart + 1][midc] == element) {
            return new int[]{ rstart + 1, midc };
        }

        // for part 1
        if (element <= matrix[rstart][midc - 1]) {
            return binary_search(matrix, rstart, 0, midc - 1, element);
        }
        // for part 2
        if (element <= matrix[rstart + 1][midc - 1] && element>=matrix[rstart+1][0]) {
            return binary_search(matrix, rstart + 1, 0, midc - 1, element);
        }
        // for part 3
        if (element >= matrix[rstart][midc + 1] && element<=matrix[rstart][cols-1]) {
            return binary_search(matrix, rstart, midc + 1, cols-1, element);
        }
        // for part 4
        if (element >= matrix[rstart + 1][midc + 1]) {
            return binary_search(matrix, (rstart + 1), (midc + 1),( cols-1), element);
        }
        return new int[]{-1,-1};

    }

    public static int[] binary_search(int[][] matrix, int row, int cstart, int cend, int target) {
        while (cstart <= cend) {
            int mid = cstart + (cend - cstart) / 2;
            if (matrix[row][mid] == target) {
                return new int[] { row, mid };
            }
            if (matrix[row][mid] < target) {
                cstart = mid + 1;
            } else {
                cend = mid - 1;
            }
        }
        return new int[]{ -1, -1 };
    }
}

public class Sorted_Matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2,  3,  4  },
                { 5, 6,  7,  8  },
                { 9, 10, 11, 12 }
        };
        MatrixSearch ss = new MatrixSearch();
        int[] arr=ss.Searchh(matrix, 10);
        for(int k=0;k<arr.length;k++)
        {
            System.out.println(arr[k]);
        }
    }
}
