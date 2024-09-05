package LinkedList;

public class Palindrome { 
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

    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }
        return slow;
    }

    public boolean palindrome(){
        //step1: find the midnode of LL
        Node midnode = findMid(head);

        //step2: reverse the 2nd half of the LL
        Node prev = null;
        Node curr = midnode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;         //left half ka head prev hoga
        Node left = head;

        //step3: check left-half == right-half
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
        
    }

    public static void main(String args[]){
        Palindrome p1 = new Palindrome();
        p1.addfirst(1);
        p1.addfirst(2);
        p1.addfirst(1);
        //p1.addfirst(2);
        p1.printLL();
        System.out.print(p1.palindrome());

    }

    
}
