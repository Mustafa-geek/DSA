package Functions;

public class Prime {
    public static boolean isPrime (int n) {    //prime nos for >=2 
     if (n==2){
        return true;
     }
        boolean isPrime = true ;
        for(int i=2; i<=n-1; i++){
            if( n%i == 0){
              return false;          // isPrime = false;
                                     // break;

            }
           
        }
          return true;              // return isPrime;
    }

    public static void main(String args[]){
        System.out.println(isPrime(2));
    }
}
