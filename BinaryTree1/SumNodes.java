package BinaryTree1;
import java.util.*;
public class SumNodes {

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

    public static int sum(Node root){
        if(root == null){
            return 0;
        }

        int lh = sum(root.left);
        int rh = sum(root.right);
        return lh + rh + root.data;

    }

    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        System.out.print("The sum of Nodes is " + sum(root));
    }
    
}

