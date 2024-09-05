package LinkedList;

public class ReverseLL {
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
        //creating a new node
        Node newnode = new Node(data);

        //special case
        if(head == null){
            head = tail = newnode;
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

    public void reverse(){
        Node prev = null;
        Node curr = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;

    }

    public static void main(String args[]){
        ReverseLL r1 = new ReverseLL();
        r1.addfirst(3);
        r1.addfirst(2);
        r1.addfirst(1);
        r1.printLL();
        r1.reverse();
        r1.printLL();


    }
    
    
}
