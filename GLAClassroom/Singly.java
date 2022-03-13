import java.util.Scanner;

import java.util.*;

class Node {
    int roll;
    node next;
}

public class Singly {
    Node start;

    Singly() {
        start = null;
    }

    void insert() {
        System.out.println("Enter your roll no");
        Scanner sc2= new Scanner(System.in);
        int data=sc2.nextInt()
        Node nn=new Node();
        nn.roll=data;
        nn.next=null;

        if(start==null){
            start=nn;
        }
        else{
            
        }
    }

    void delete() {
        System.out.println("delete is working");
    }

    // void traverse() {
    //     if (start == null) {
    //         System.out.println("list empty");
    //     } else {
    //         System.out.println("list element--");
    //         Node current;
    //         for (current = start; current != null; current = current.next) {
    //             System.out.println(" " + current.roll);
    //         }
    //     }
    // }

    public static void main(String[] args) {
        Singly obj = new Singly();

        while(true){
            System.out.println("\npress 1 for insert");
            System.out.println("press 2 for delete");
            System.out.println("press 3 for traverse");
            System.out.println("press 4 for exit");
            System.out.println("enter your choicw");

            Scanner sc= new Scanner(System.in);
            int choice=sc.nextInt();
            switch (choise){
                case 1:
                obj.insert();
                break;
                case 2:
                obj.delete();
                break;
                case 3:
                obj.traverse();
                break;
                case 4:
                System.exit(0);
                break;
                default:
                System.out.println("wrong choize");

        }

    }
    
}
