package Queues;
import java.util.*;

public class StackUsingDeque {
    static class stackk{
      static Deque <Integer> dq = new LinkedList<>();

       static void push(int data){
            dq.addFirst(data);   // here no int return cuz use common sense ..kya return karna ! wo jo tum abhi add kare 

        }

       static int pop(){
           return dq.removeFirst();
        }

      static int peek(){
            return dq.getFirst();
        }
    }

    public static void main(String args[]){
        stackk s = new stackk();         //this stackk is above class 
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
        s.pop(); 
    }
    
}
