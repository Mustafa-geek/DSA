package Queues;
import java.util.*;

public class QueueUsingDeque {
    static class queuequeue{
      static Deque <Integer> dq = new LinkedList<>();

       static void add(int data){
            dq.addLast(data);   // here no int return cuz use common sense ..kya return karna ! wo jo tum abhi add kare 

        }

       static int remove(){
           return dq.removeFirst();
        }

      static int peek(){
            return dq.getFirst();
        }
    }

    public static void main(String args[]){
        queuequeue q = new queuequeue();         //this stackk is above class 
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.peek());
        q.remove();
        System.out.println(q.peek());
        q.remove();
        System.out.println(q.peek());
        q.remove(); 
    }
    
}
