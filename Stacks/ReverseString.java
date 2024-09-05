package Stacks;
import java.util.*;

public class ReverseString {
    public static void main(String args[]){
        Stack <String> stack = new Stack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
    
}
