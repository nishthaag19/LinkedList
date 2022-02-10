import java.util.*;
//to remove duplicates from sorted linked list
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
public class RemoveDuplicate {
    public static void main(String[] args) {
        Node head = null;
        Scanner s = new Scanner(System.in);
        LLOperations ob = new LLOperations();
        while (true) {
            System.out.println("enter choice");
            int c = s.nextInt();
            switch (c) {
                case 1:
                    int x= s.nextInt();
                    head=ob.insertBeg(head,x);
                    break;
                case 2:
                    ob.print(head);
                    break;
                case 3:
                    ob.remove(head);
                    break;
                default:
                    System.out.println("invalid");
            }
        }

    }
    }
    class LLOperations{
            static Node insertBeg(Node head,int x) {
        Node temp=new Node(x);
        temp.next=head;
        return temp;
    }
    static Node remove(Node head) {
        if (head == null)
            return null;
        else {
            Node temp = head;
            while (temp.next != null) {
                if (temp.data == temp.next.data)
                    temp.next = temp.next.next;
                else
                    temp = temp.next;
            }
            return head;
        }

    }
     static void print(Node head){
                if (head == null)
                    System.out.println("empty");
                  else {
             Node curr = head;
             while (curr != null) {
                 System.out.print(curr.data + "   ");
                 curr = curr.next;
             }
           }
        }
    }
