import java.util.Scanner;

// to find middle of linked list.
class Node {
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}

public class MiddleOfLinkedlist
{
    Node head;
    void findMiddle()
    {
        Node slowptr = head;
        Node fastptr = head;

        while (fastptr != null && fastptr.next != null)
        {
            fastptr = fastptr.next.next;
            slowptr = slowptr.next;
        }
        System.out.println(slowptr.data);
    }

   public void insert(int data) {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }

    public void print()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data+"  ");
            temp = temp.next;
        }
        System.out.println("-1");
    }

    public static void main(String [] args)
    {
        MiddleOfLinkedlist ob = new MiddleOfLinkedlist();
        Scanner s = new Scanner(System.in);
        Node head=null;
        char ch;
        do{
            System.out.println("1 insert " );
            System.out.println("2  find middle" );
            System.out.println("3 print " );
            int c = s.nextInt();
            switch (c) {
                case 1:
                    int n = s.nextInt();
                     ob.insert(n);
                    System.out.println("node Inserted");
                    break;
                case 2:
                    ob.findMiddle();
                    break;
                case 3:
                     ob.print();
                    System.out.println("nodes printed");
                    break;
                default:
                    System.out.println("enter choice again");
                    break;
            }
            System.out.println("to continue press c");
             ch= s.next().charAt(0);

        }while(ch=='c');
    }
}
