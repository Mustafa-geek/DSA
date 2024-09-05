package BST;

public class Delete {
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
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static Node build(Node root, int k) {
        if (root == null) {
            root = new Node(k);
            return root;
        }
        if (k < root.data) {
            root.left = build(root.left, k);    //assigning values imp root.left/right
        } else {
            // (k > root.data)
            root.right = build(root.right, k);  //assigning values imp root.left/right
        }
        return root;
    }

    
    public static Node deleteNode(Node root,int k){
        if(k < root.data){
           root.left = deleteNode(root.left, k);
        }
        if(k > root.data){
           root.right = deleteNode(root.right, k);
        }
        else{ //got our node ie to be deleted
              
            //case1
            if(root.left == null && root.right == null){
                return null;
            }

            //case2
            if(root.left == null){
                // root.right = root.right.right;
                return root.right;
            }
            if(root.right == null){
                // root.left = root.left.left;
                 return root.left;
            }

            //case3
            //left most node in the right subtree
            Node IS = findinordersuccessor(root.right);
            root.data = IS.data;
            root.right = deleteNode(root.right, IS.data); //putting root.right is very imp here
        }  
        return root;  

    }

    public static Node findinordersuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    public static void main(String args[]){
    int values[] = {8,5,3,1,4,6,10,11,14};
    Node root = null;
    for (int i = 0; i < values.length; i++) {
        root = build(root,values[i]);
    }
    inorder(root);

    root = deleteNode(root, 11);
    System.out.println();
    
    inorder(root);
    

    }
}

