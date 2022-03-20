import java.util.Scanner;

// polynomial addition

class PANode{
    int c;
    int e;
    PANode next;

    public PANode(int c, int e) {
        this.c = c;
        this.e = e;
    }
}
public class PolyAdd {

    PANode head;
    public boolean isEmpty(){
        return (head==null);
    }

    public void insert(PANode newnode){
        if(isEmpty())
            head=newnode;
        else{
            PANode temp=head;
            while(temp.next!=null){
                temp=temp.next;

            }
            temp.next=newnode;
        }
    }

    public int count(){
        int c=0;
        if(isEmpty())
            System.out.println("empty");
        else {

            PANode temp = head;
            while (temp != null) {
                c++;
                temp = temp.next;
            }
        }
        return c;
    }

    public void sortPoly(){
        PANode node1=head;
        PANode node2=head.next;
        int t1,t2;
    while(node1!=null) {

        while (node2 != null) {
            if (node1.e < node2.e) {
                t1 = node1.e;
                node1.e = node2.e;
                node2.e = t1;

                t2 = node1.c;
                node1.c = node2.c;
                node2.c = t2;

            }
            node2 = node2.next;
        }
        node1=node1.next;
    }
    }

    public void print(){
        if(isEmpty())
            System.out.println("empty");
        else{
            PANode curr=head;
            while(curr!=null){
                System.out.print(curr.c+"x^"+curr.e+" + ");
                curr=curr.next;

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        PolyAdd p1= new PolyAdd();
        PolyAdd p2= new PolyAdd();
        PolyAdd p3= new PolyAdd();

        System.out.println("enter no of terms in first poly");
        int n1=sc.nextInt();
        for (int i = 0; i < n1; i++) {
            p1.insert(new PANode(sc.nextInt(), sc.nextInt()));
        }

        System.out.println("enter no of terms in second  poly");
        int n2=sc.nextInt();
        for (int i = 0; i < n2; i++) {
            p2.insert(new PANode(sc.nextInt(), sc.nextInt()));
        }
        p1.sortPoly();
        p2.sortPoly();
        p1.print();
        p2.print();

        PANode temp1=p1.head;
        PANode temp2=p2.head;


            if (p1.count() == p2.count()) {
                while (temp1 != null && temp2 != null) {
                if (temp1.e == temp2.e) {
                    p3.insert(new PANode(temp1.c + temp2.c, temp1.e));
                    temp1 = temp1.next;
                    temp2 = temp2.next;
                } else if (temp1.e > temp2.e) {
                    p3.insert(new PANode(temp1.c, temp1.e));
                    temp1 = temp1.next;
                } else {
                    p3.insert(new PANode(temp2.c, temp2.e));
                    temp2 = temp2.next;
                }
              }
            }
            else if (p1.count() > p2.count()) {
                while (temp1 != null) {
                    if (temp1.e == temp2.e) {
                        p3.insert(new PANode(temp1.c + temp2.c, temp1.e));
                        temp2 = temp2.next;

                    } else {
                        p3.insert(new PANode(temp1.c, temp1.e));
                    }
                    temp1 = temp1.next;
                }

            } else {
                while (temp2 != null) {
                    if (temp1.e == temp2.e) {
                        p3.insert(new PANode(temp1.c + temp2.c, temp1.e));
                        temp1 = temp1.next;

                    } else {
                        p3.insert(new PANode(temp2.c, temp2.e));

                    }
                    temp2 = temp2.next;
                }

            }

        System.out.println("resultant polynomial is");
        p3.print();
    }

}
