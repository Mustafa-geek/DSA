package Recursion;

public class Power {
    public static int power(int a, int n){
        if(n==0){
            return 1;
        }
        int halfpower = power(a,n/2);
        int halfpowerSq = halfpower * halfpower;

        if(n%2!=0){
            return a*halfpowerSq;
        }

      return halfpowerSq;
    }

    public static void main(String args[]){
        System.out.println(power(2,4));
    }
    
}
