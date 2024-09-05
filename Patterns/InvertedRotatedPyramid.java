package Patterns;

public class InvertedRotatedPyramid {
    public static void invertRotPyr(int n){
        for (int i=1; i<=n; i++){               //outer loop ie no of lines

            for(int j=1; j<=n-i; j++) {       //for spaces                 
                System.out.print(" ");
                 } 

                for(int j=1;j<=i;j++){
                    System.out.print("*");      //for stars
                }
                System.out.println();
            }            
        } 
    public static void main(String args[]){
        invertRotPyr(6);
    }
}