//to print nodes using generics in singly linked list
class Node<T>{
        T data;
        Node<T> next;
        Node(T data){
        this.data=data;
        }
   }
public class TraverseGen {
    public static void main(String[] args) {
        Node<Integer> n1=new Node<>(10);
        n1.next=new Node<>(20);
        n1.next.next=new Node<>(30);
        n1.next.next.next=new Node<>(40);
        n1.next.next.next.next=new Node<>(50);
        print(n1);
    }
     static void print(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.println(curr.data+" ");
            curr=curr.next;
        }
    }
}
