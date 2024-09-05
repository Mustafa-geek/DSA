package BinaryTree3;
import java.util.*;
public class KthAncestor {

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

public static int kthlevel(Node root ,int n, int k){
    if(root == null){
        return -1;
    }
    if(root.data == n){
        return 0;
    }
   int leftS = kthlevel(root.left, n, k);
   int rightS = kthlevel(root.right, n, k);

   if(leftS == -1 && rightS ==-1){
    return -1;
   }

   int distance = Math.max(leftS,rightS);
   if(distance+1 == k){
    System.out.print(root.data);
   }
   return distance + 1;
}
public static void main(String args[]){
    Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int k = 2;
        int n = 6;
        kthlevel(root,n,k);
}
    
}
