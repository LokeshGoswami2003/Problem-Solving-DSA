public class Cycle_Sort { // given numbers in range 1 to n
    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 4, 3 };
        cycle(arr);
        print(arr);
    }

    static void cycle(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int corrrect = arr[i] - 1;
            if (arr[i] != arr[corrrect]) {
                swap(arr, i, corrrect);
            } else {
                i++;
            }
        }

    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void print(int[] arr) {
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
    }
}