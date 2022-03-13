import java.util.*;
public class SinglyQueu {
    int[] arr;
    int front, rear;
    void SinglyQueue() {
 
    }

    void insert() {

    }

    void delete() {

    }

    void traverse() {
        if (front == -1 || rear == -1)
        {
            System.out.println("SinglyQueue empty");
        }
        else {
            for (int i = front; i <= rear; i++) {
                System.out.println(" " + arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        SinglyQueue obj = new SinglyQueue();
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            default:
                System.out.println("Wrong Choice");
        }

    }

}
