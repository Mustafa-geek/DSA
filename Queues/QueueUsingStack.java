package Queues;

import java.util.*;

public class QueueUsingStack {

    public static class work {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        boolean empty(){
            if(s1.isEmpty()){
                return true;
            }
            else{
                return false;
            }
        }

        // add
        void add(int data) {
            if (s1.isEmpty()) {
                s1.push(data);
            } 
            else {

                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }

                s1.push(data);

                while (!s2.isEmpty()) {
                    s1.push(s2.pop());
                }
            }
        }

        // remove
        int remove() {
            return s1.pop();
        }

        // peek
        int peek() {
            return s1.peek();
        }
    }

    public static void main(String args[]){
        work w1 = new work();
        w1.add(1);
        w1.add(2);
        w1.add(3);

        while(!w1.empty()){
            System.out.println(w1.peek());
            w1.remove();
        }


    }
}
