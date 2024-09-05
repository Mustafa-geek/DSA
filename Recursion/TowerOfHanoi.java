package Recursion;

public class TowerOfHanoi {
    public static void toh(int n , char src , char des, char helper){

        if(n==1){
            System.out.println("move disk " + n + " from " + src +  " to " + des);
            return;
        }

        toh(n-1, src, helper, des);
        System.out.println("move disk " + n + " from " + src  + " to " + des);
         toh(n-1, helper, des, src);
    }

    public static void main(String args[]){
        int n = 3;
        toh(n,'A','C','B');
    }
    
}

