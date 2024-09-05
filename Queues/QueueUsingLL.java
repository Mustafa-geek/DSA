package Queues;

public class QueueUsingLL {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node head = null;
    static Node tail = null;

    static class Queue{

        public boolean isEmpty(){
            if(head ==null && tail == null){
                return true;
            }
            else{
                return false;
            }
        }

        public void add(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public int remove(){
            if(isEmpty()){
                System.out.print("Queue is empty");
                return -1;
            }
            
            int front = head.data;

            //for 1 element
            if(head == tail){
                head = tail = null;
            }
            else{
                 head = head.next;
            }
            return front;
        }

        public int peek(){
            return head.data;
        }
    }

    public static void main(String args[]){
        Queue q1 = new Queue();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        while(!q1.isEmpty()){
            System.out.println(q1.peek());
            q1.remove();
        }
    }
    
}
