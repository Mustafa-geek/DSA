package Queues;
import java.util.*;

import java.util.LinkedList;
public class QueueReverse {

    public static void reverseQueue(Queue<Integer>q1){
        Stack <Integer> s = new Stack<>();
        while(!q1.isEmpty()){
            s.add(q1.remove());
        }
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String args[]){
        Queue <Integer> q1 = new LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        reverseQueue(q1);
    }
    
}
