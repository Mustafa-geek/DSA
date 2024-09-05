package Queues;
import java.util.*;

public class Interleave {

    public static Queue<Integer> interleave(Queue<Integer>q1){
        Queue<Integer> temp = new LinkedList<>();
        int halfsize = q1.size()/2;

        for(int i=0; i<halfsize;i++){
            temp.add(q1.remove());
        }
        while(!temp.isEmpty()){
            q1.add(temp.remove());
            q1.add(q1.remove());
        }
        return q1;
    }

    public static void main(String args[]){
        Queue <Integer> q1 = new LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.add(6);
        q1.add(7);
        q1.add(8);
        q1.add(9);
        q1.add(10);
        System.out.print(interleave(q1));
    }
    
}
