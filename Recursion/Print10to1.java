package Recursion;

public class Print10to1 {
    public static void printnum(int n){
        if(n==1){
        System.out.print(n);
        return;
        }
        System.out.println(n);
        printnum(n-1);
    }
    public static void main(String args[]){
           printnum(10);
    }
    
}
