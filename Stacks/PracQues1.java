package Stacks;
import java.util.*;

public class PracQues1 {
    public static boolean isPalindrome(LinkedList <Character> list){
        Stack <Character> s = new Stack<>();

        for(int i=0; i<list.size(); i++){   //pushing all the characters to stack
            char ch = list.get(i);
            s.push((ch));
        }

        for(int  i=0; i<s.size(); i++){        //traversing from down to up
            char ch = list.get(i);
            if(s.pop() != ch){
                return false;
            }
        }

        return true;
    }
    

    public static void main(String args[]){
        LinkedList <Character> list = new LinkedList<>();
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('B'); 
        list.add('A'); 
        System.out.print(isPalindrome(list));

    }
}
