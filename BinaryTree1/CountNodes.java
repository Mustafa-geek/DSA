package BinaryTree1;
import java.util.*;
public class CountNodes {

    static class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    public static int  countN(Node root){
        if(root == null){
            return 0;
        }

        int lc = countN(root.left);
        int rc = countN(root.right);
        return lc+rc + 1;
    }

    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        System.out.print("The number of nodes in the given tree are " + countN(root));
    }
    
}

