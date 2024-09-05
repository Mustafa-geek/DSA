package BinaryTree3;
import java.util.*;

public class MinDistance {
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

    public static Node lca2(Node root,int n1,int n2){
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }

        Node leftLca = lca2(root.left, n1, n2);
        Node rightLca = lca2(root.right, n1, n2);

        if(leftLca == null){
            return rightLca;
        }

        if(rightLca == null){
            return leftLca;
        }

        return root;

    }

    public static int calDist(Node root,int n){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }

        int leftdis = calDist(root.left, n);
        int rightdis = calDist(root.right, n);

        if(leftdis == -1 && rightdis == -1){
            return -1;
        }
        else if(leftdis == -1){
            return rightdis + 1;
        }
        else{
            return leftdis + 1;
        }
    }

    public static int minDist(Node root,int n1,int n2){
        Node lca = lca2(root, n1, n2);//calling lca func to get lca

        int dist1 = calDist(lca,n1);
        int dist2 = calDist(lca,n2);
        return dist1 + dist2;
    }

    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int n1 = 4 ;
        int n2 = 6 ;
        System.out.println(minDist(root, n1, n2));
    }

}
