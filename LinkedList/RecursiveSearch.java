package LinkedList;

public class RecursiveSearch {
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

    public boolean searchKey(Node temp,int key){
        //base case
        if(temp == null){
            return false;
        }
        if (temp.data == key){
            return true ;
        }
        
        return searchKey(temp.next,key);
    }

    public static void main(String args[]){
       // Node temp = head;
        RecursiveSearch r1 = new RecursiveSearch();
        r1.addfirst1(66);  //it is add first remember
        r1.addfirst1(98);
        r1.addfirst1(76);
        r1.addfirst1(12);

        Node temp = head;
        System.out.print(r1.searchKey(temp, 76));
    }
    
}
