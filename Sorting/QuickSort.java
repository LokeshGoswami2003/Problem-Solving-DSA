public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        sort(arr, 0, arr.length - 1);
        print(arr);
    }

    static void sort(int[] arr, int low, int hi) {
        if (low >= hi) {
            return;
        }
        int s = low;
        int e = hi;
        int mid = (s + e) / 2;
        int parity = arr[mid];
        while (s <= e) {

            while (arr[s] < parity) {
                s++;
            }

            while (arr[e] > parity) {
                e--;
            }

            if (s <= e) {
                swap(arr, s, e);
                s++;
                e--;
            }

        }

        sort(arr, low, e);
        sort(arr, s, hi);
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void print(int[] arr) {
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
