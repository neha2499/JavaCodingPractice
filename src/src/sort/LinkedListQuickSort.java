package sort;

public class LinkedListQuickSort {
    Node head;

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    // Function to insert a new node at the end of the linked list
   private void insert(int data) {
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
    private void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }


    public void swapData(Node one, Node Two){
        int temp= one.data;
        one.data=Two.data;
        Two.data=temp;
    }


      public Node pivot(Node start, Node end){

        if (start==end || start==null || end==null){
            return start;
        }

        Node current = start;
        Node pivot_prev= start;
       //here end Node is set to be pivot from which all the nodes will be compared

      while(start!=end){
          if(start.data<end.data){
              pivot_prev=current;
              swapData(start,end);
              current=current.next;

          }

          start=start.next;
      }

      swapData(current,end);

        return pivot_prev;
      }


      public void sort(Node start,Node end){

        if(start==null || start==end || start==end.next){
            return;
        }


        Node pivot_prev= pivot(start,end);
        sort(start,pivot_prev);

        if (pivot_prev!=null && pivot_prev==start){
            sort(pivot_prev.next,end);
        }else if (pivot_prev!=null && pivot_prev.next!=null){
            sort(pivot_prev.next.next,end);
        }
      }

    public static void main(String[] args) {
        LinkedListQuickSort linkedList = new LinkedListQuickSort();

        linkedList.insert(5);
        linkedList.insert(1);
        linkedList.insert(4);
        linkedList.insert(2);
        linkedList.insert(8);

        System.out.println("Original Linked List:");
        linkedList.printList(linkedList.head);

        Node n= linkedList.head;
        while(n.next!=null){
            n=n.next;

        }

        linkedList.sort(linkedList.head, n);

        System.out.println("Linked List after Bubble Sort:");
        linkedList.printList(linkedList.head);
    }

}
