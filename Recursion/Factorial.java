package Recursion;

public class Factorial {
    public static int fact(int n){
        if(n==0){
            return 1 ;
        }

        int fn1 = fact(n-1);     //fn1 = factorial of n - 1 
        int ans = n * fn1;
        //syso(ans) == we will get factorial of every number from 0 to n 
        return ans;

    }

    public static void main(String args[]){
        System.out.println(fact(5));
    }
}

