package Queues;

public class CircularQUsingArray {

    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front = -1;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty() {
            if(rear == -1 && front == -1){
                return true;
            }
            else{
                return false;
            }
        }

        public static boolean isFull(){
            if((rear + 1) % size == front){
                return true;
            }
            else{
                return false;
            }
        }

        // add
        public static void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            //1st element add
            if(front == -1){
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // remove
        public static int remove() {
            if (isEmpty()) {
                return -1;
            }
            int ans = arr[front];

            //single element
            if(front == rear){
                front = rear = -1;
            }
            else{
                front = (front + 1) % size;
            }
            return ans;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.print("queue is empty");
                return -1;
            }
            return arr[front];
        }

    }

    public static void main(String args[]){
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }

}
