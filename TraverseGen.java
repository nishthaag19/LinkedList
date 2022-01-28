//to print nodes using generics in singly linked list
public class TraverseGen {
    public static void main(String[] args) {
        Node<Integer> n1=new Node<>(10);
        Node<Integer> n2=new Node<>(20);
        Node<Integer> n3=new Node<>(30);
        n1.next=n2;
        n1.next.next=n3;
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
class Node<T>{
    T data;
    Node<T> next;
    Node(T data){
        this.data=data;
    }
}