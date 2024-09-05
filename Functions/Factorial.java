package Functions;

public class Factorial {
    public static int factorial(int n){
        int f = 1;
        for(int i=1 ;i<=n ;i++){
            f = f * i;
        }
       return f;
    }
    public static void main(String args[]){
        System.out.println(factorial(5));          //giving the value of n through actual parameters in printing stmt itself
    
    }
}