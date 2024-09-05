package Stacks;
import java.util.*;

public class StackUsingJVC {
    public static void main(String args[]){
        Stack <Integer> s = new Stack<>();
        s.push(45);
        s.push(98);
        s.push(88);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
