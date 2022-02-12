import java.util.Scanner;
//all operations on doubly linked list.
class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
    }
}
public class DoublyLinkedList{
    public static void main(String[] args) {
        DLLOperations ob = new DLLOperations();
        Scanner s = new Scanner(System.in);
        Node head=null;
        char ch;
        do{
            System.out.println("1 insert beginning" );
            System.out.println("2 insert end" );
            System.out.println("3 insert index " );
            System.out.println("4 delete beginning" );
            System.out.println("5 delete end" );
            System.out.println("6 delete index" );
            System.out.println("7 print" );
            System.out.println("enter your choice");
            int c = s.nextInt();
            switch (c) {
                case 1:
                    int n = s.nextInt();
                    head=ob.insertBeg(head, n);
                    System.out.println("node Inserted at beginning");
                    break;
                case 2:
                    int x = s.nextInt();
                    ob.insertEnd(head, x);
                    System.out.println("node Inserted at end");
                    break;
                case 3:
                    int i=s.nextInt();
                    int y = s.nextInt();
                    ob.insertIndex(head,y,i);
                    System.out.println("node Inserted");
                    break;
                case 4:
                    head=ob.deleteBeg(head);
                    System.out.println("node Deleted at beginning");
                    break;
                case 5:
                    ob.deleteEnd(head);
                    System.out.println("node Deleted at end");
                    break;
                case 6:
                    int a=s.nextInt();
                    ob.deleteIndex(head,a);
                    System.out.println("node Deleted");
                    break;
                case 7:
                    ob.print(head);
                    System.out.println("nodes printed");
                    break;
                default:
                    System.out.println("enter choice again");
                    break;
            }
            System.out.println("tp continue press c");
             ch= s.next().charAt(0);
        }while(ch=='c');
        }
    }

class DLLOperations{
    static Node insertBeg(Node head,int data){
        Node temp=new Node(data);
        temp.next=head;
        if(head!=null)head.prev=temp;
        return temp;
    }

    static Node insertEnd(Node head,int data){
        Node temp=new Node(data);
        if(head==null)
            return temp;
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=temp;
        temp.prev=curr;
        return head;
    }
    static Node  insertIndex(Node head, int data, int pos)
    {
        Node newNode = new Node(data);
        Node temp = head;
        for(int i=0; i<pos; i++){
            if(temp.next!=null){
                temp = temp.next;
            }else
                break;
        }
        if(temp.next!=null){
            temp.next.prev = newNode;
            newNode.next = temp.next;
        }
        newNode.prev = temp;
        temp.next = newNode;
        return head;
    }
    static Node deleteBeg(Node head){
        if(head==null)return null;
        if(head.next==null){
            return null;
        }
        else{
            head=head.next;
            head.prev=null;
            return head;
        }
    }
    static Node deleteEnd(Node head){
        if(head==null)
            return null;
        if(head.next==null){
            return null;
        }
        Node curr=head;
        while(curr.next!=null)
            curr=curr.next;
        curr.prev.next=null;
        return head;

    }
    static Node deleteIndex(Node head,int pos){
        if(head==null || pos<=0)
            return null;
        Node curr=head;
        for (int i = 0; curr!=null &&i < pos ; i++) {
            curr=curr.next;
        }
        if(curr==null)
            return null;
        if( head==curr)
            head=curr.next;

        if(curr.next!=null)
            curr.next.prev=curr.prev;
        if (curr.prev != null)
            curr.prev.next = curr.next;

        return head;

    }

    public static void print(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }System.out.println();
    }
}

