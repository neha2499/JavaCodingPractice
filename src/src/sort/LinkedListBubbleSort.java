package sort;


    class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public class LinkedListBubbleSort {
        node head;

        // Function to swap two adjacent nodes
        private void swap(node p1, node p2) {
            node ptr1 = p1;
            node ptr2 = p2;

            // If p1 is the head, update the head
            if (head == ptr1) {
                head = ptr2;
            } else {
                // Find the previous node of p1
                node temp = head;
                while (temp.next != p1) {
                    temp = temp.next;
                }

                // Update the next pointer of the previous node of p1
                temp.next = ptr2;
            }

            // Swap the nodes
            node temp = ptr2.next;
            ptr2.next = ptr1;
            ptr1.next = temp;
        }
        // Function to perform Bubble Sort on the linked list
        public void bubbleSort() {
            int count = getCount();
            node h = head;


            for (int i = 0; i < count - 1; i++) {
                System.out.println("i "+i);
                node current = head;


                for (int j = 0; j < count - i - 1; j++) {
                    // Check if adjacent nodes are in ascending order
                    Boolean isSwapped= false;
                    System.out.println("j "+j);
                    if (current != null && current.next != null && current.data > current.next.data) {
                        // Swap the nodes
                        System.out.println("current "+current.data +" & current.next "+ current.next.data);
                        swap(current, current.next);
                        isSwapped= true;
                        printList();

//                        if (current != null)
//                            current = current.next;
                    }

                      if (!isSwapped){
                          if (current != null)
                         current = current.next;
                         System.out.println("new current "+ current.data);
                            }

                    }
                    System.out.println("out of the loop");



                }

                // If no swapping occurred, the list is already sorted
//                if (swapped == 0) {
//                    break;
//                }


            }


        // Function to get the count of nodes in the linked list
        private int getCount() {
            int count = 0;
            node current = head;

            while (current != null) {
                count++;
                current = current.next;
            }

            return count;
        }

        // Function to insert a new node at the end of the linked list
        public void insert(int data) {
            node newNode = new node(data);

            if (head == null) {
                head = newNode;
            } else {
                node last = head;
                while (last.next != null) {
                    last = last.next;
                }
                last.next = newNode;
            }
        }

        // Function to print the linked list
        public void printList() {
            node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }

        public static void main(String[] args) {
            LinkedListBubbleSort linkedList = new LinkedListBubbleSort();

            linkedList.insert(5);
            linkedList.insert(1);
            linkedList.insert(4);
            linkedList.insert(2);
            linkedList.insert(8);

            System.out.println("Original Linked List:");
            linkedList.printList();

            linkedList.bubbleSort();

            System.out.println("Linked List after Bubble Sort:");
            linkedList.printList();
        }
    }




