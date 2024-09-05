package BinaryTree3;
import java.util.*;
public class Sum {

public static class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.left = null;
        this.right = null;
        this.data = data;
    }
}

public static void preorder(Node root){
    if(root == null){
        return;
    }
    System.out.print(root.data + " ");
    preorder(root.left);
    preorder(root.right);
}

public static int sumofChild(Node root){
    if(root == null){
        return 0;
    }

   int leftchild = sumofChild(root.left);
   int rightchild = sumofChild(root.right);
   

   int data = root.data;  //saving the value of root data

   root.data = leftchild + rightchild;

   return data + root.data;   
}
public static void main(String args[]){
    Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        sumofChild(root);
        preorder(root);
    }
    
}

