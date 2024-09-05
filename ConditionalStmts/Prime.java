package ConditionalStmts;
import java.util.*;
public class Prime {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        if (n==2) {
            System.out.println("given number is prime");
        } 
         else {
            boolean isPrime = true;
            for( int i=2; i<=n-1; i++){
                if (n%i==0){
                    isPrime = false;
                }
            }

            if (isPrime == true) {
                System.out.println("given number is a prime number"); 
            } else {
                System.out.println("given number is not a prime number");
            }
        }
    }
}
    

