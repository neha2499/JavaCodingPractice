package tree;



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BST {

    Node root;

    class Node{

        int value;
        Node left;
        Node right;

        Node(int value){
            this.value=value;
        }
    }


    public boolean insert(int value){
        Node newNode= new Node(value);
        if(root==null){
            root=newNode;
            return true;
        }
        Node temp= root;
        while(true){
            if(newNode.value< temp.value){
                if(temp.left==null){
                   temp.left=newNode;
                   return true;
                }

                temp=root.left;

            }else {
                if(temp.right==null){
                    temp.right=newNode;
                    return true;
                }

                temp=temp.right;

            }
        }

    }


    public boolean contains(int value){

        if(root==null){
            return false;
        }

        Node temp= root;
        while(temp!=null){

            if(temp.value<value){
                temp=temp.right;
            } else if (temp.value>value) {
                temp=temp.left;
            } else {return true;}
        }

        return false;
    }


    public void breadthFirstSearch (){

       Node currentNode= root;

        Queue<Node> queue = new LinkedList<>();
        ArrayList<Integer> list= new ArrayList<Integer>();
        queue.add(currentNode);
        while(queue.size()>0){
            currentNode= queue.remove();
            if(currentNode.left!=null){

                queue.add(currentNode.left);
               

            }

            if(currentNode.right!=null){
                queue.add(currentNode.right);
            }

            list.add(currentNode.value);
        }

        System.out.println(list);


    }

    //depth First Search... PreOder Traversal
    public ArrayList<Integer> BFSPreOrder(){
        ArrayList<Integer> results= new ArrayList<>();

        class Traverse{
            Traverse(Node currentNode){

                results.add(currentNode.value);
                if(currentNode.left!=null){
                    new Traverse(currentNode.left);
                }
                if(currentNode.right!=null){
                    new Traverse(currentNode.right);
                }
             // when the current node is done running that means it has looked left as well right then it is popped from the call stack
            }



        }

        new Traverse(root);
        return results;
    }


    //Depth First Search Post Order Traversal

    public ArrayList<Integer> DFSPostOrder(){
        ArrayList<Integer> results= new ArrayList<>();

        class Traverse{
            Traverse(Node currentNode){


                if(currentNode.left!=null){
                    new Traverse(currentNode.left);
                }
                if(currentNode.right!=null){
                    new Traverse(currentNode.right);
                }
                results.add(currentNode.value);
            }



        }

        new Traverse(root);
        return results;
    }


    //Depth First Search In Order Traversal

    public ArrayList<Integer> DFSInOrder(){
        ArrayList<Integer> results= new ArrayList<>();

        class Traverse{
            Traverse(Node currentNode){


                if(currentNode.left!=null){
                    new Traverse(currentNode.left);
                }

                results.add(currentNode.value);

                if(currentNode.right!=null){
                    new Traverse(currentNode.right);
                }

            }



        }

        new Traverse(root);
        return results;
    }
}
