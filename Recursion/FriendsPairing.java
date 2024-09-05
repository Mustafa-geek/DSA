package Recursion;

public class FriendsPairing {
    public static int pairing(int n){

        // base condition
        if(n == 1 || n == 2){
            return n;
        }

     //single person 
     int single  = pairing(n-1);

     //pairs
     int pairs= n-1 * pairing(n-2);

     return single + pairs;           //here directly we can return pairing(n-1) + (n-1) * pairing(n-2);

    }
    
    public static void main(String args[]){
        System.out.print(pairing(3));
    }
}
