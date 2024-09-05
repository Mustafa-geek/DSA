package Stacks;
import java.util.*;

public class ReverseStack {

    public static void pushBottom(Stack <Integer> stack,int data){
        if(stack.isEmpty()){
            stack.push(data);
            return;
        }
        int top = stack.pop();
        pushBottom(stack, data);
        stack.push(top); 
    }

    public static void revStack(Stack <Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int top = stack.pop();
        revStack(stack);
        pushBottom(stack,top);
    }
    public static void printstack(Stack <Integer> stack){
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
    public static void main(String args[]){
        Stack <Integer> stack = new Stack<>();
        stack.push(33);
        stack.push(25);
        stack.push(100);
        revStack(stack);
        printstack(stack);
    }
    
}
