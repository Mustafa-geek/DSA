package Recursion;

public class SumuptoN {
    public static int sum(int n ){
        if(n==1){
            return 1;
        }
        int snm1 = sum(n-1);      //sm1 =  sum of n minus 1
        int sumofn = n + snm1;
        return sumofn;
    }
    
    public static void main(String args[]){
        System.out.print(sum(3));
    }
}
 