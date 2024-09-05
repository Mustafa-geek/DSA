package Stacks;
import java.util.*;

public class PushatBottom {

    public static void pushBottom(Stack <Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushBottom(s, data);
        s.push(top); 
    }
    public static void main(String args[]){
        Stack <Integer> s = new Stack<>();
        s.push(87);
        s.push(98);
        s.push(23);
        pushBottom(s,100);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    
}
