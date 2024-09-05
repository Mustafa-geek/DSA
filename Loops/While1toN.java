package Loops;
import java.util.*;

public class While1toN {   public static void main(String args[])
    {
        int counter=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n= sc.nextInt();
        System.out.println("the numbers between 1 to"  + n + " are");
        while ( counter<=n){
            System.out.println(counter);
            counter++;
        }
    }    
    }
    
    

