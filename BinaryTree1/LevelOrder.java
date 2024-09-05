package BinaryTree1;
import java.util.*;

public class LevelOrder {
    //Node class
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    //Binary tree class
    static class BinaryTree{
        static int idx = -1;  
        static Node BuildTree(int nodes[]){
            idx++;  //used for traversing the nodes array 1 by 1 
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = BuildTree(nodes);
            newNode.right = BuildTree(nodes);

            return newNode;
        }

        public static void levelorder(Node root){
            Queue <Node> q1 = new LinkedList<>();
            q1.add(root);

            while(!q1.isEmpty()){
                Node temp = q1.remove();
                System.out.print(temp.data + " ");

                if(temp.left != null){
                    q1.add(temp.left);
                }

                if(temp.right != null){
                    q1.add(temp.right);
                }
            }
        }
    }

    public static void main(String args[]){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree b1 = new BinaryTree();
        Node root = b1.BuildTree(nodes);
        b1.levelorder(root);
    }
    
}
