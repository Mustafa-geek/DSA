package Functions;

public class StriverPrime {
        public static void isPrime(int n){
            int count = 0;
            if (n==2){
                System.out.println("2 is a prime ");
            }
            for (int i=2; i*i<n; i++){
                if (n%i==0)
                count++ ;
            
            if(n/i!=i){
                count++;
            }
        }
        System.out.print(count);
        }
       
    
        public static void main(String args[]){
            isPrime(36);
        }
    
}
