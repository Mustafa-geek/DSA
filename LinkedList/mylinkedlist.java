package LinkedList;

public class mylinkedlist {

    public static class Node{
         int data;
         Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addfirst1(int data){
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

    public void addMiddle(int index,int data){
        if(head == null){                         //special case
            addfirst1(data);
            return;
        }
        Node newnode = new Node(data);          //creating new node
        Node temp = head;                      //creating temp node 
        int i = 0;
        while(i < index-1){                      
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    public void removefirst(){
    //corner cases in notebook
      head = head.next;
    }
    
    public void removelast(){
        if(head == null){
            System.out.print("ll is empty");
        }
        
        Node temp = head;
        Node previous = null;       //holds the prev value of temp
        while(temp.next != null){
            previous = temp;
            temp = temp.next;
        }
        previous.next = null;
        tail = previous;            
    }
    public static void main(String args[]){
        mylinkedlist ll = new mylinkedlist();
        ll.addfirst1(3);
        ll.addfirst1(4);
        ll.addlast(8);
        ll.addlast(9);
        ll.addMiddle(2,43 );
        ll.printLL();
        ll.removelast();
        ll.printLL();
        ll.removefirst();
        ll.printLL();
    }
}
