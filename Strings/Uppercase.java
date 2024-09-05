package Strings;

public class Uppercase {
    public static String touppercase(String str){
       StringBuilder sb  = new StringBuilder();

       char ch = Character.toUpperCase(str.charAt(0));
       sb.append(ch);

        for(int i=1; i<str.length();i++){

           if( str.charAt(i) ==' ' && i<str.length()-1){

            sb.append(str.charAt(i));            //appends space to sb 
            i++;
             sb.append(Character.toUpperCase(str.charAt(i)));     //first converts the letter after space to uppercase & then apppends it  
           }

           else{
            sb.append(str.charAt(i));        //appends letters to sb
            }
        }  
       return sb.toString();     //coverts to String

    }
     public static void main(String args[]){
        String str = "hello world from a noob programmer";
        System.out.print(touppercase(str));
    }
    
}
