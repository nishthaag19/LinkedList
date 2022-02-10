//to convert linked list to array

public class LinkedListToArray {
   static  class Node {
       int  data;
       Node next;
   }
    static Node add(int data) {
        Node newnode = new Node();
        newnode.data = data;
        newnode.next = null;
        return newnode;
    }
    static void convert(Node head) {
            int len = countNodes(head);
            int []arr = new int[len];
            int index = 0;
            Node curr = head;
            while (curr != null) {
                arr[index++] = curr.data;
                curr = curr.next;
            }
            printArray(arr, len);
        }
    static void printArray(int a[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print(a[i]+" ");
    }

    static int countNodes(Node head) {
        Node curr = head;
        int cnt = 0;
        while (curr != null) {
            cnt++;
            curr = curr.next;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Node head = new Node();
        head = add(1);
        head.next = add(2);
        head.next.next = add(3);
        head.next.next.next = add(4);
        head.next.next.next.next = add(5);
        convert(head);
        }
}
