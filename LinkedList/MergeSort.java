package LinkedList;
import java.util.*;
public class MergeSort {

    public class Node{
        Node next;
        int data;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }
        //step1- find mid 
        Node mid = midNode(head);

        //step-2 breaking into 2 parts 
        Node righthead = mid.next;
        mid.next = null;

        Node head1 = mergeSort(head);
        Node head2 = mergeSort(righthead);

        //step-3  merging the broken parts
        return merge(head1,head2);

    }
        //merge function
    public Node merge(Node head1,Node head2){
        Node dummy = new Node(-1);
        Node temp = dummy;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                temp = temp.next;
                head1 = head1.next;
            }
            else{
                temp.next = head2;
                temp = temp.next;
                head2 = head2.next;
            }
        }
        while(head1 != null){
            temp.next = head1;
            temp = temp.next;
            head1 = head1.next;
        }
        while(head2 != null){
            temp.next = head2;
            temp = temp.next;
             head2 = head2.next;
        }

        return dummy.next;
    }

    //finding midnode
    public Node midNode(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void addlast(int data){
        //creating a new node
        Node newnode = new Node(data);
        //special case
        if(head == null){
            head = tail = newnode;
            return;
        }

        //step 2 
        tail.next = newnode;
        //step 3 
        tail = newnode;
    }

    public void printLL(){
        if(head == null){
            System.out.print("LL is empty");
        }
        Node temp ;
        temp = head;
        while(temp != null){
        System.out.print(temp.data + "->");
         temp = temp.next;
        }
        System.out.println("null");
    }


    public static void main(String args[]){
        MergeSort m1 = new MergeSort();
        m1.addlast(90);
        m1.addlast(98);
        m1.addlast(45);
        m1.addlast(55);
        m1.addlast(61);
        m1.addlast(100);
        m1.addlast(1);
        m1.printLL();
        head = m1.mergeSort(head); //assigning new head cuz after sorting the head changes 
        m1.printLL();
    }

    
}
