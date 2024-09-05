package BinaryTree1;

public class PracQue1 {
    
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

public void univalued(Node root){
    Node k = root;

    univalued(root.left);
    univalued(root.right);
    
}
public static void main(String args[]){
    Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
    }
    
}
    
}
