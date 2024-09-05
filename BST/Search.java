package BST;

public class Search {
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static boolean searchNode(Node root,int k){
        if(root == null){
            return false;
        }
        if(root.data == k){
            return true;
        }
        if(k < root.data){
           return searchNode(root.left, k);
        }
        else{
        // (k > root.data)
           return searchNode(root.right, k);
        }
      // return false; no need of this false it seems as already gicven in root==null case
    }
    public static void main(String args[]){
        Node root = new Node(4);
            root.left = new Node(2);
            root.right = new Node(5);
            root.left.left = new Node(1);
            root.left.right = new Node(3);
            root.right.right = new Node(6);
            int k = 9;
            System.out.print(searchNode(root,k));
        }
}
