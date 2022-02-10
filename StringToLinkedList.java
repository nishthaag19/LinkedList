import java.util.Scanner;
//to convert a string to a singly linked list.
public class StringToLinkedList {
    static class Node {
        char data;
        Node next;
    }
    static Node add(char data) {
        Node newnode = new Node();
        newnode.data = data;
        newnode.next = null;
        return newnode;
    }

    static Node convert(String str, Node head){
        head = add(str.charAt(0));
        Node temp = head;
        for (int i = 1; i < str.length(); i++) {
            temp.next = add(str.charAt(i));
            temp = temp.next;
        }
        return head;
    }

    static void print(Node head) {
        Node curr = head;
        while (curr != null)
        {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String str=s.next();
        Node head = null;
        head = convert(str, head);
        print(head);
    }
}
