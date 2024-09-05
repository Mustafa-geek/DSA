package LinkedList;

public class RemoveDuplicates {
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

    public void removeDuplicates(){
        Node temp = head;
        while(temp != null){
            int td = temp.data;     //td=temp data
            Node tn = temp.next;     //tn = temp next
            int tnd = tn.data;       //tnd = temp next ka data

            if(td == tnd){
                temp.next = temp.next.next;
            }
            
            temp = temp.next;
        }

    }

    public static void main(String args[]){
        RemoveDuplicates r1 = new RemoveDuplicates();
        r1.addfirst1(4);
        r1.addfirst1(4);
        r1.addfirst1(2); 
        r1.addfirst1(1);
        r1.addfirst1(1);  
        r1.printLL();
        r1.removeDuplicates();
        r1.printLL();
    }
    
}
