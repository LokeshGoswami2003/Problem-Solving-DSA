import java.util.*;
public class Single{
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }       
    }
    Node head=null;
    Node tail=null;

    public void addnode(int data){
        Node newNode = new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
    }
    void display(){
        Node current=head;
        if(head==null){
            System.out.println("empty list");
        }
        while(current!=null){
            System.out.println(current.data+" ");
            current.next;
        }
    }

    public static void main(String[] args) {
        Single obj = new Single();

        while(true){
            System.out.println("\npress 1 for insert");
            System.out.println("press 2 for delete");
            System.out.println("press 3 for traverse");
            System.out.println("press 4 for exit");
            System.out.println("enter your choicw");
            int dataa;
            Scanner sc1= new Scanner(System.in);
            int choice=sc1.nextInt();
            switch (choice){
                case 1:
                Scanner sc= new Scanner(System.in);
                dataa=sc.nextInt();
                obj.addnode(dataa);
                break;
                // case 2:
                // obj.delete();
                // break;
                // case 3:
                // obj.traverse();
                // break;
                case 4:
                System.exit(0);
                break;
                default:
                System.out.println("wrong choize");
            }
        }

    }
}