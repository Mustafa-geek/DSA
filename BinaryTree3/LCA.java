package BinaryTree3;
import java.util.*;

public class LCA {
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

    public static boolean getpath(Node root, ArrayList<Node>path , int n){
        if(root == null){   //base case
            return false;
        }

        path.add(root);

        if(root.data == n){  //condition
            return true;
        }

       boolean Leftpath =  getpath(root.left, path, n);
       boolean Rightpath =  getpath(root.right, path, n);

        if(Leftpath || Rightpath){ //dono mei se koi ek true laya toh func ku return karo true 
            return true;
        }

        path.remove(path.size() - 1); //remove node jiski dono side ek bhi true nhi hai 
        return false;


    }

    public static Node lca(Node root,int n1, int n2){
        ArrayList <Node> path1 = new ArrayList<>();
        ArrayList <Node> path2 = new ArrayList<>();

        getpath(root,path1,n1);    //returns the req path ans from root to n1 node
        getpath(root,path2,n2);
        
        int i=0;
        for(; i<path1.size() && i<path2.size(); i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }

        Node lca = path1.get(i-1);
        return lca;
    }

    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        System.out.print(lca(root,4,5).data);
    }
    
}
