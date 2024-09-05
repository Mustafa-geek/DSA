package Strings;

public class charAt {
    public static void printletters(String str){
      for(int i=0; i<str.length(); i++){
        System.out.print(str.charAt(i) + " ");
       } 
    }
    public static void main(String args[]){
        String firstname = "Khazi";
        //System.out.println(firstname.charAt(0));  to print single letter
        printletters(firstname);

    }
    
}
