package Recursion;

public class Fibonacci {
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }

        int fib_nm1 = fib(n-1);
        int fib_nm2 = fib(n-2);
        int ans = fib_nm1 + fib_nm2;
        return ans;
    }
    
    public static void main(String args[]){
        System.out.print(fib(5));
    }
}
