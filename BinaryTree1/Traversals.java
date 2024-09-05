package BinaryTree1;
public class Traversals {

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
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = BuildTree(nodes);
            newNode.right = BuildTree(nodes);

            return newNode;
        }
        
      //creating preorder sequence 
      public static void preorder(Node root){
          if(root == null){
              return;
          }
          System.out.println(root.data + " ");
          preorder(root.left);
          preorder(root.right);
        }

      //creating inorder sequence 
      public static void inorder(Node root){
          if(root == null){
              return;
          }
          inorder(root.left);
          System.out.println(root.data + " ");
          inorder(root.right);
        }
        
      //creating postorder sequence 
      public static void postorder(Node root){
          if(root == null){
              return;
          }
          postorder(root.left);
          postorder(root.right);
          System.out.print(root.data + " ");
        }


    }

    public static void main(String args[]){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree t1 = new BinaryTree();
        Node root = t1.BuildTree(nodes);    //creating the root

       //t1.preorder(root);
       //t1.inorder(root);
       //t1.postorder(root);

    }
    
}
