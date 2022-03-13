import java.util.*;

class Find_Floor {
    public int return_floor(int[] arr, int element) {

        int start = 0;
        int end = arr.length - 1;
        int mid;
        if (arr[start] > element && element != arr[start]) {
            return -1;
        }
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == element) {
                System.out.println("element found on index " + mid);
                break;
            }
            if (arr[mid] < element) {
                start = mid + 1;
            }
            if (arr[mid] > element) {
                end = mid - 1;
            }

        }

        return end;

    }
}

public class Floor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter the array elements 0-9 : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter The Element you want Floor value of : ");
        int element = sc.nextInt();
        Find_Floor ss = new Find_Floor();
        int pos = ss.return_floor(arr, element);
        if (pos != -1) {
            System.out
                    .println("The Floor value of element " + element + " is " + arr[pos] + " at position " + (pos + 1));
        } else {
            System.out.println("not find");
        }
    }
}
