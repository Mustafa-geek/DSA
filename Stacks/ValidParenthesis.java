package Stacks;
import java.util.*;

public class ValidParenthesis {
    public static boolean isValid(String str){
        Stack <Character> s = new Stack<>();
        int n = str.length();

        for(int i=0; i<n; i++){

            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){      //for ch== opening brackets
                s.push(ch);
            }
            else{                          //it means that ch is a closing bracket

                //corner case for all ))))))))))))))
                if(s.isEmpty()){
                    return false;
                }

                if(ch == ')' && s.peek() == '(' ||
                   ch == ']' && s.peek() == '[' ||
                   ch == '}' && s.peek() == '{' ){
                    
                    s.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String args[]){
        String str = "]]]]]]]]]]]{}";
        System.out.print(isValid(str));
    }
    
}
