package Stacks;
import java.util.*;

public class RevString2 {
    public static void main(String args[]){
        Stack <Character> stack = new Stack<>();
        String str = "abcdefgh";
        int index = 0;

        while(index < str.length()){
            stack.push(str.charAt(index));
            index++;
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
    
}
