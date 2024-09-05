package Recursion;
public class PracQues3 {
     static String arr[]= {"zero","one","two","three","four","five","six","seven","eight","nine"};

    public static void  numToStr(int n){

        if(n==0){
            return;
        }

        int ld = n%10;           //(remainder)
        int quotient = n/10;

        numToStr(quotient);

         System.out.print(arr[ld] + " ");
    }

    public static void main(String args[]){
        numToStr(123);
    }
}

//You are given a number (eg -  2019), convert it into a String of english like“two zero one nine”. 
// Use a recursive function to solve this problem.

