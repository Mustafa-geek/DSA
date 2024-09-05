package LinkedList;

public class LinearSearch {

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

    public int searchkey(int key){
        Node temp = head;
        int i = 0;
        while(temp.next != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;

    }

    public static void main(String args[]){
        LinearSearch l1 = new LinearSearch();
        l1.addfirst1(66);  //it is add first remember
        l1.addfirst1(98);
        l1.addfirst1(76);
        l1.addfirst1(12);
        System.out.print("the key is at the index " + l1.searchkey(12));

    }
    
}
