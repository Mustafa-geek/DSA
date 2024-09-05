package Recursion;

public class BinaryString {
    public static void binString(int n , int lp, String str){  //lp=lastplace

        // base case
       if(n == 0) {
          System.out.println(str);
           return;
       }   

       binString(n-1,0,str+"0");   //calling with lp as 0 as we dont have any prob with consecutive or any 0's

       if(lp == 0){
        binString(n-1,1,str+"1");         // putting lp=1 as we know lp was 0 
       }
    }

    public static void main(String args[]){
        binString(3,0,"");

    }

    
}
