package Recursion;

public class TillingProb {
    public static int tilling(int n) { // 2xn

    //base condition
    if(n == 0 || n == 1){
        return 1;
    }
             
    //vertical tiles
    int vertical = tilling(n-1);

    //horizontal tiles
    int horizontal = tilling(n-2);

    return horizontal + vertical;
}

    public static void main(String args[]){
           int n = 3;
        System.out.print(tilling(n));

    }
}

