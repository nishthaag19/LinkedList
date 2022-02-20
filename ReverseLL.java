import java.util.Scanner;
//to reverse a linked list.
public class ReverseLL {
    static Node head=null;

    public static void main(String[] args) {
       // Scanner s= new Scanner(System.in);
        ReverseLL ob=new ReverseLL();
        ob.head=new Node(10);
        ob.head.next=new Node(20);
        ob.head.next.next=new Node(30);
        ob.head.next.next.next=new Node(40);
        ob.print(head);
        head=ob.reverse(head);
        System.out.println("reversed linked list");
        ob.print(head);

    }
    Node reverse(Node head){
        if(head==null || head.next==null)
            return head;

        Node prev=null;
        Node curr=head;
        while(curr!=null)
        {
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }

    void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
