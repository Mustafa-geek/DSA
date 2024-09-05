package Strings;

public class SubString {
    public static String subString(String str,int si,int ei){
    String substr = ""; 

    for(int i=si;i<ei;i++){
        substr += str.charAt(i);
    }
    return substr;
}
    public static void main(String args[]){
        String str = "HI from MARS";
       // subString(str,7,12));
       System.out.println(str.substring(7,12)); //inbuilt function
    }
    
}
