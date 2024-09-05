package LinkedList;

public class RemoveCycle {
    public static class Node{
        Node next;
        int data;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public static boolean detectcycle(){
        Node slow = head;
        Node fast = head;

      while(fast != null && fast.next!=null){
           slow = slow.next;
           fast = fast.next.next;
           if(slow == fast){
            return true;
           }
        }
        return false;
    }

    public static void removeCycle(){
        //step-1 detect cycle
        Node slow = head;
        Node fast = head;
        Boolean flag = false;

      while(fast != null && fast.next!=null){
           slow = slow.next;
           fast = fast.next.next;
        
          if(slow == fast){
             flag = true;
             break;
            }
        }

        if(flag == false){       //no cycle exists
            return;
        }

        //step-2 find lastnode
        slow = head;
        Node prev = null;
        while(slow != fast){
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }
        
        prev.next = null;        //step-3

    }

    public static void main(String args[]){
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(4);
        head.next.next.next = temp; 
        //1->2->4->2
        System.out.println(detectcycle());    //detecting the cycle 
        removeCycle();                        //removing the cycle 
        System.out.print(detectcycle());      //again checking if cycle exists or not 
    }

 }

    

