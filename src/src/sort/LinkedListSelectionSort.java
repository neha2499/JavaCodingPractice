package sort;

public class LinkedListSelectionSort {

    Node head;

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    // Function to swap two adjacent nodes
    private void swap(Node p1, Node p2) {
        Node ptr1 = p1;
        Node ptr2 = p2;

        // If p1 is the head, update the head
        if (head == ptr1) {
            head = ptr2;
        } else {
            // Find the previous node of p1
            Node temp = head;
            while (temp.next != p1) {
                temp = temp.next;
            }

            // Update the next pointer of the previous node of p1
            temp.next = ptr2;
        }

        // Swap the nodes
        Node temp = ptr2.next;
        ptr2.next = ptr1;
        ptr1.next = temp;
    }

    // Function to get the count of nodes in the linked list
    private int getCount() {
        int count = 0;
        Node current = head;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

    // Function to insert a new node at the end of the linked list
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }

    // Function to print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }


    public void selectionSort(){
        Node a= head;
        Node b;
        Node minPtr;
        while(a.next!=null){
            minPtr=a;
            b=a.next;
            System.out.println("After first while loop minPtr = "+minPtr.data+" a ="+a.data+" b= "+b.data);
            while(b.next!=null){

                if(minPtr.data>b.data){
                    minPtr=b;
                    System.out.println("within second while loop minPtr"+minPtr.data);
                }

                b=b.next;
                System.out.println("within second while loop b "+b.data);
            }


            if(minPtr!=a){
                swap(a,minPtr);
               a=minPtr;

            }

            a=a.next;

        }
    }


    public static void main(String[] args) {
        LinkedListSelectionSort linkedList = new LinkedListSelectionSort();

        linkedList.insert(5);
        linkedList.insert(1);
        linkedList.insert(4);
        linkedList.insert(2);
        linkedList.insert(8);

        System.out.println("Original Linked List:");
        linkedList.printList();

       linkedList.selectionSort();

        System.out.println("Linked List after Bubble Sort:");
        linkedList.printList();
    }
}
