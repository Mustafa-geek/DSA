package Recursion;

public class XPowerN2 {
    public static int optimisedCode(int x,int n){

        //base condition
        if(n==0){
            return 1;
        }
        
       //if n is even 

       // int halfpowersq = optimisedCode(x,n/2) * optimisedCode(x,n/2);         
       // in above two func calls....takes more time. So,

       int halfpower = optimisedCode(x,n/2);
       int halfpowersq = halfpower * halfpower;           // doing like this takes less time 

        // if n is odd
        if(n%2 != 0 ){
            return x * halfpowersq;
        }

          return halfpowersq;

    }   
    public static void main(String args[]){
        System.out.print(optimisedCode(3,5));
    }

    
}


