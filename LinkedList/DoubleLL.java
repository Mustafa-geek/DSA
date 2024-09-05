package LinkedList;
public class DoubleLL {

    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newnode = new Node(data);
        size++;
        if(head == null){
            head = tail = newnode;
            return;
        }

        newnode.next = head;
        head.prev = newnode;
        head = newnode;
        
    }

    public void printDLL(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void deleteFirst(){
        //corner cases in book
        head = head.next;
        head.prev = null;
        size--;
    }

    public void addLast(int data){
        Node newnode = new Node(data);
        tail.next = newnode;
        newnode.prev = tail;
        tail = newnode;
        size++;
    }

    public void deleteLast(){
        if(tail == null){
            System.out.println("DLL is empty");
            return;
        }
        if(tail == head){
            head = tail = null;
        }
        tail = tail.prev;
        tail.next = null;
        size--;
    }

    public static void main(String args[]){
        DoubleLL dll = new DoubleLL();
        dll.addFirst(3);
        dll.addFirst(10);
        dll.addFirst(8);
        dll.addFirst(1);
        dll.printDLL();
        System.out.println("the size of LL after adding first is " + dll.size);

        dll.deleteFirst();
        dll.printDLL();
        System.out.println("the size of LL after deleting first is " + dll.size);

        dll.addLast(200);
        dll.printDLL();
        System.out.println("the size of LL after adding last is " + dll.size);

        
        dll.deleteLast();
        dll.printDLL();
        System.out.println("the size of LL after deleting last is " + dll.size);
        
    }
    
}


