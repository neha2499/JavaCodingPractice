package sort;

public class MergeSortLinkedList {

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
    public void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }



    // Go through it
    private Node merge(Node a, Node b){

       Node result= null;
       if(a==null) return b;
       if (b==null) return a;

       if(a.data<=b.data){
           result=a;
           result.next=merge(a.next,b);
       }else{
           result=b;
           result.next=merge(a,b.next);
       }


        return result;
    }

     Node midIndex(Node n){
        if(n==null) return n;
       Node slowNode= n ;
       Node fastNode=n;

        while(fastNode.next!=null && fastNode.next.next!=null){
            slowNode=slowNode.next;
            fastNode=fastNode.next.next;
        }

        return slowNode;
    }




    public Node mergeSort(Node h){
        if( h==null|| h.next==null) return h;

        Node midIndex= midIndex(h);

        Node nextOfMiddle=midIndex.next;

        midIndex.next=null;
        Node left=mergeSort(h);
        Node right= mergeSort(nextOfMiddle);


       return merge(left,right);
    }


    public static void main(String[] args) {
        MergeSortLinkedList linkedList = new MergeSortLinkedList();

        linkedList.insert(5);
        linkedList.insert(1);
        linkedList.insert(4);
        linkedList.insert(2);
        linkedList.insert(8);

        System.out.println("Original Linked List:");
        linkedList.printList(linkedList.head);

//he midIndex method is called on the linkedList instance, and the head field is accessed through
// this instance. This is the correct way to use non-static methods and instance variables within a class.
// I appreciate your patience, and I hope this clears up any confusion.
       Node n= linkedList.midIndex(linkedList.head);
        System.out.println("MiddleIndex : "+n.data);
       Node f= linkedList.mergeSort(linkedList.head);
        System.out.println("Linked List after Merge Sort:");
        linkedList.printList(f);
    }
}
