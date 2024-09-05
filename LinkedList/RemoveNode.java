package LinkedList;

public class RemoveNode {
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addfirst(int data){
        Node newnode = new Node(data);
        if(head == null){
            head=tail=newnode;
            return;
        }

        //step 2
        newnode.next = head;
        //step 3
        head = newnode;

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


    public void removeNthNode(int n){
        //Calculating size of linked list 
        Node ans = head;
        int size = 0;
        while(ans != null){
            ans = ans.next;
            size++;
        }

        //special case
        if(size == n){
            head = head.next;
        }

        //removing nth node from last
        Node temp = head;
        int i=1;
        while(i != (size-n)){       //traversing from head to the node that is to be deleted
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        return;
    }

    public static void main(String args[]){
        RemoveNode rn = new RemoveNode();
        rn.addfirst(45);
        rn.addfirst(40);
        rn.addfirst(35);
        rn.addfirst(25);
        rn.addfirst(20);
        rn.printLL();
        rn.removeNthNode(3);    //removing 3rd node from last
        rn.printLL();
    }
    
}
