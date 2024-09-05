package Strings;

public class Stringbilder {
    public static void main(String args[]){

        StringBuilder sb  = new StringBuilder("");
        for(char ch='a'; ch<='z'; ch++){
            sb.append(ch);
           // String str = sb.toString();

        }
        System.out.print(sb);
    }
    
}
