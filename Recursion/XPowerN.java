package Recursion;

public class XPowerN {
    public static int power(int x,int n){

        if(n==0){
            return 1;
        }

       // int xpnm1 = power(x,n-1);      // xpnm1 = x power n minus 1
       // int ans = x * xpnm1;
       // return ans;

       return  x* power(x,n-1);
    }

    public static void main(String args[]){
        System.out.print(power(5,2));
    }
    
}
