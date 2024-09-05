package Stacks;
import java.util.*;

public class DuplicateParanthesis {
    public static boolean isDuplicate(String str){
        Stack <Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++){
          char ch =  str.charAt(i);

           if(ch != ')')       //pushing all untill we get )
           {
             s.push(ch);
            }

            else{      //it means it is a closing bracket
              int count = 0;
              while( s.pop() != '('){
                count++;
                }

              if(count == 0){
                  return true;
                }
            }
        }
       return false;
    }
public static void main(String args[]){
    String str = "(a+b)";
    System.out.print(isDuplicate(str));
}
}
