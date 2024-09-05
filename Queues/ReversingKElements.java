package Queues;
import java.util.*;

public class ReversingKElements {

    public static Queue<Integer> reversingElements(Queue<Integer>q,int k){
        Stack <Integer> s = new Stack<>();

        if(k==1 || k==0){
            return q;
        }
        
        for(int i=0; i<k; i++){
            s.push(q.remove());
        }

        while(!s.isEmpty()){
            q.add(s.pop());
        }

        if(k==q.size()){
            return q;
        }

        if(q.size() % 2 == 0){
            for(int i=0; i<k; i++){
                q.add(q.remove());
            }
        }
        else{
            for(int i=0; i<k-1; i++){
                q.add(q.remove());
            }
        }

        return q;

    }
    
    public static void main(String args[]){
        Queue <Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.print(reversingElements(q, 3));
    }
}
