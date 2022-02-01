import java.util.Scanner;
//operations on singly linked list
//insertion at beg,end,at given index
//deletion at beg,end,at given index
//print the nodes
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}
 public class SinglyLinkedList {
    public static void main(String[] args) {
        Operations ob = new Operations();
        Scanner s = new Scanner(System.in);
        Node head=null;
        System.out.println("enter your choice");
        int c = s.nextInt();
        do {
            switch (c) {
                case 1:
                    int n = s.nextInt();
                    head=ob.insertBeg(head, n);
                    System.out.println("node Inserted at beginning");
                    System.out.println("new choice");
                    c = s.nextInt();
                    break;
                case 2:
                    int x = s.nextInt();
                    ob.insertEnd(head, x);
                    System.out.println("node Inserted at end");
                    System.out.println("new choice");
                    c = s.nextInt();
                    break;
                case 3:
                    int y = s.nextInt();
                    int i=s.nextInt();
                    ob.insertIndex(head,y,i);
                    System.out.println("node Inserted");
                    System.out.println("new choice");
                    c = s.nextInt();
                    break;
                case 4:
                    head=ob.deleteBeg(head);
                    System.out.println("node Deleted at beginning");
                    System.out.println("new choice");
                    c = s.nextInt();
                    break;
                case 5:
                    ob.deleteEnd(head);
                    System.out.println("node Deleted at end");
                    System.out.println("new choice");
                    c = s.nextInt();
                    break;
                case 6:
                    int a=s.nextInt();
                    ob.deleteIndex(head,a);
                    System.out.println("node Deleted");
                    System.out.println("new choice");
                    c = s.nextInt();
                    break;
                case 7:
                    ob.print(head);
                    System.out.println("nodes printed");
                    System.out.println("new choice");
                    c = s.nextInt();
                    break;
                default:
                    System.out.println("enter choice again");
                    break;
            }
        }while(c>0&&c<8);
    }
}
class Operations {
    static Node insertBeg(Node head,int x) {
        Node temp=new Node(x);
        temp.next=head;
        return temp;
    }
    static  Node insertEnd(Node head,int x){
        Node temp=new Node(x);
        if(head==null)
                return temp;
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=temp;
        return head;
    }
    static Node insertIndex(Node head, int data, int index) {
        Node n1 = head;
        Node temp = new Node(data);
        if (head == null)
            return temp;
        if (index == 0) {
            temp.next = head;
            return temp;
        }
        Node curr = head;
        for (int i = 1; i < index - 1; i++) {
            curr = curr.next;
        }
        Node n2 = head.next;
        head.next = temp;
        head = head.next;
        head.next = n2;
        return  n1;
    }
    static Node deleteIndex(Node head,int index){
        if(head==null)
            return head;
        Node temp=head;
        if(index==0){
            head=temp.next;
            return head;
        }
        for (int i = 0; i < index-1; i++) {
            temp=temp.next;
        }
        Node next=temp.next.next;
        temp.next=next;
        return head;
   }
    static Node deleteBeg(Node head){
        if(head==null)
            return null;
        else if(head.next==null)
            return null;
        else
            head=head.next;
            return head;
    }
    static Node deleteEnd(Node head){
        if(head==null)return null;
        if(head.next==null)return null;
        Node curr=head;
        while(curr.next.next!=null)
            curr=curr.next;
        curr.next=null;
        return head;
    }
    static void print(Node head){
        if(head==null)
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
