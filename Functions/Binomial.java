package Functions;

public class Binomial {
    public static int factorial(int n){
    int f = 1;
    for(int i=1 ;i<=n ;i++){
        f = f * i;
    }
   return f;

    
}
    public static int binomialcoeff(int n , int r){
        int fact_n = factorial (n);
        int fact_r = factorial (r);
     int fact_nmr = factorial(n-r);

     int binomialcoeff= (fact_n) /(fact_r * fact_nmr);          //nmr=n minus r
     return binomialcoeff;


    }
    public static void main(String args[]){
         System.out.print(binomialcoeff(5,2));
    }
}