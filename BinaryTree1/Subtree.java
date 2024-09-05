package BinaryTree1;
import java.util.*;
public class Subtree {

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

    public static boolean isIdentical(Node root, Node subroot){
        //conditions to check
         if(root == null && subroot == null){  //agar dono null toh true
            return true;
        }
        else if(root == null || subroot == null){  //koi ek null dusra not null
            return false;
        }
        else if(root.data != subroot.data ){
            return false;
        }

        //for traversing 
        if(!isIdentical(root.left, subroot.left)){ //uppar ke conditions check karte jaana ..agar ek bhi false milgya toh false khatam baat ye puree func ku false return kardena (cuz then it will be a non identical)
            return false;
        }

        if(!isIdentical(root.right, subroot.right)){
            return false;
        }

        //if all conditions does not satisfy den it is a identical node
        return true;
    }

  public static boolean subtree(Node root, Node subroot){
     if(root == null){  //false q ki subtree non-empty nhi hai 
         return false;
     }
     
     if(root.data == subroot.data){   //subtree wala part milgya 

         if(isIdentical(root,subroot)){  //iska matlab identical bhi hogye(if cndtion is imp)
         return true;
         }
     }
 
     boolean lefttree = subtree(root.left,subroot); //traversing 
     boolean righttree = subtree(root.right,subroot); //traversing 
 
     return lefttree || righttree; //dono meise koi ek true return karna ki subtree usmei mili
    }


    public static void main(String args[]){

        //original tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        //subtree 
        Node subroot = new Node(2);
        subroot.left = new Node(4);
        subroot.right = new Node(5);

        System.out.print(subtree(root, subroot));
    }
    
}

