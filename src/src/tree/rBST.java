package tree;

public class rBST {

    Node root;

    public class Node{

        public int value;
        Node left;
        Node right;

        Node(int value){
            this.value=value;
        }
    }

    public Node getRoot(){
        return root;
    }

    // we are doing method overriding

    private boolean rContains(Node currentNode, int value){

      //Define the base Cases & there are two base cases

        if(currentNode==null) return false;

        if(currentNode.value==value) return true;

        if (value<currentNode.value) {
            return rContains( currentNode.left , value);
        } else

            return rContains( currentNode.right , value);


    }

    public boolean rContains( int value){
      return rContains(root,value) ;
    }

    private Node rInsert(Node currentNode, int value){

        //define the base case

        if (currentNode==null) return new Node(value);

        if(value<currentNode.value){
            currentNode.left=rInsert(currentNode.left, value);
        } else if(value>currentNode.value){
            currentNode.right=rInsert(currentNode.right, value);
        }


        //below return statement is when the value is already present
        //BST doesn't allow duplicates

      return currentNode;


    }



    public void rInsert(int value){

        if (root==null) root= new Node(value);
         rInsert(root, value);
    }



    
}
