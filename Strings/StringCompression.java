package Strings;
public class StringCompression {
    public static String compression(String str){
        String newstring = "";
       //StringBuilder sb = new StringBuilder(); 
        for(int i=0; i<str.length(); i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
            count++;
            i++;
            }
           newstring +=str.charAt(i);
            //sb.append(i);
        
        
          if(count>1){
          // sb.append(count.toString());
            newstring += count.toString(); 
          }
        }
        //return sb.toString();    //converts stringbuilder to string
        return newstring;
    }
    public static void main(String args[]){
    String str = "aabbcd";
    System.out.print(compression(str));
    }
    
}
