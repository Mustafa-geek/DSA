package Functions;
import java.util.*;
public class Sum {
    public static int calculatesum(int num1,int num2) {   //passing parameters[parameters OR formal parameters]
        int sum = num1 + num2 ;
        return sum;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b =sc.nextInt();
        int sum = calculatesum(a,b);                       //[arguments OR actual parameters]
        System.out.println("sum is " + sum);

    }
}
