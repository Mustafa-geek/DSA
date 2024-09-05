package LinkedList;

public class DetectingLoop {
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

    public static boolean detectLoop(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;       //+1
            fast = fast.next.next;  //+2

            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]){
        head = new Node(1);         //static keyword was used in Node class to initialise like this 
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;
        System.out.print(detectLoop());   //static keyword was used in detectLoop class to initialise like this 
        

    }
    
}
