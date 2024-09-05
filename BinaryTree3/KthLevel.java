package BinaryTree3;
import java.util.*;

public class KthLevel {
    // Node class
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Binary tree class
    static class BinaryTree {
        static int idx = -1;

        static Node BuildTree(int nodes[]) {
            idx++; // used for traversing the nodes array 1 by 1
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = BuildTree(nodes);
            newNode.right = BuildTree(nodes);

            return newNode;
        }

        public static void kLevel(Node root, int k) {
            if (root == null || k < 1) {
                return;
            }

            Queue<Node> q1 = new LinkedList<>();
            q1.add(root);
            int level = 1;

            while (!q1.isEmpty() && level < k) {
                int levelSize = q1.size();

                for (int i = 0; i < levelSize; i++) {
                    Node temp = q1.poll();

                    if (temp.left != null) {
                        q1.add(temp.left);
                    }

                    if (temp.right != null) {
                        q1.add(temp.right);
                    }
                }

                level++;
            }

            if (level == k) {
                int size = q1.size(); // Get the number of nodes in the queue
               for (int i = 0; i < size; i++) {
                 Node node = q1.poll(); // Remove and retrieve the node from the queue
                   System.out.print(node.data + " "); // Print the data of the node
                }
            }
        }
    }

    public static void main(String args[]) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree b1 = new BinaryTree();
        Node root = b1.BuildTree(nodes);
        b1.kLevel(root, 3);
    }
}
