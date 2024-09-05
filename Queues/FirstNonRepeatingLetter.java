package Queues;
import java.util.*;

public class FirstNonRepeatingLetter {

    public static void nonRepeating(String str){
        Queue <Character> q1 = new LinkedList<>();
        int freq[] = new int[26]; //letter frequency

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            q1.add(ch);
            freq[ch-'a']++; //increasing frequency of that particular alphabet 

            while(!q1.isEmpty() && freq[q1.peek()-'a'] > 1){
                q1.remove();
            }
            if(q1.isEmpty()){
                System.out.println(-1);
            }
            else{
                System.out.println(q1.peek());
            }

        }
    }
    public static void main(String args[]){
        String str = "aabccxb";
        nonRepeating(str);
    }
    
}
