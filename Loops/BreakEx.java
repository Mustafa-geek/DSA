package Loops;
import java.util.*;

public class BreakEx {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        do {
        System.out.print("enter your number");
        int n= sc.nextInt();

        if(n%10==0){
            break;
        }
        System.out.print(n);
    }
    while(true);
    }
}
