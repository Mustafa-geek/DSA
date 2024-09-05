package LinkedList;

public class ReverseLL2 {
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

    public void reverse(Node prev,Node temp){
        while(temp != tail)
         prev = temp;
        if(temp == tail){
            head = tail;
            return;
        }

        reverse(prev,temp.next);           //was trying using recursion but nhi hhuwa sahi 

        tail.next = prev;
        prev = tail;
        tail.next = null;
    }

    public static void main(String args[]){
        ReverseLL2 r1 = new ReverseLL2();
        r1.addfirst(3);
        r1.addfirst(9);
        r1.addfirst(7);
        r1.addfirst(6); 
        r1.printLL();
        r1.reverse(head,head);
        r1.printLL();


    }
    
}
