package sort;

 class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListInsertionSort {
    Node head;

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
    // Function to perform Bubble Sort on the linked list

        // If no swapping occurred, the list is already sorted
//                if (swapped == 0) {
//                    break;
//                }





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


    public void insertionSort(){
        if (head==null) return;
        int length = getCount();
        Node current= head.next;



        while (current.next!=null) {
            Boolean isSwap = false;
            Node currentTemp=current;

            while(currentTemp!=head) {
                Node prev=head;
                System.out.println(prev.data);

                System.out.println("First while " + currentTemp.data);
                System.out.println(prev.data);
                System.out.println(currentTemp.data);
                while (prev.next != currentTemp) {
                    prev = prev.next;
                    System.out.println("Second while " + prev.data);
                }
                System.out.println(prev.data > currentTemp.data);
                while (prev.data > currentTemp.data) {
                    System.out.println("blah blah");
                    current= current.next;
                    swap(prev, currentTemp);

                    printList();
                    isSwap = true;

                    currentTemp= prev;

                     prev=head;
                    System.out.println("second while " + currentTemp.data);

                    while (prev.next != currentTemp) {
                        prev = prev.next;
                        System.out.println("third while " + prev.data);
                    }
                }




            }

            if(!isSwap) current= current.next;
        }
    }

    public static void main(String[] args) {
        LinkedListInsertionSort Sort  = new LinkedListInsertionSort();

        Sort.insert(5);
        Sort.insert(1);
        Sort.insert(4);
        Sort.insert(2);
        Sort.insert(8);

        System.out.println("Original Linked List:");
        Sort.printList();

       Sort.insertionSort();
        System.out.println("Linked List after Insertion  Sort:");
        Sort.printList();
    }
}