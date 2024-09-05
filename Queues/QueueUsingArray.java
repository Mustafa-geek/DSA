package Queues;

public class QueueUsingArray {

    static class Queue {
        static int arr[];
        static int size;
        static int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        // add
        public static void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }

        // remove
        public static int remove() {
            if (isEmpty()) {
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.print("queue is empty");
                return -1;
            }
            return arr[0];
        }

    }

    public static void main(String args[]){
        Queue q = new Queue(5);
        q.add(34);
        q.add(94);
        q.add(36);
        q.add(76);
        q.add(14);
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }

}
