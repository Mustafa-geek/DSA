package ConditionalStmts;
import java.util.*;

public class CalculatorSwitch {
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();
        System.out.println("enter any operator from + - * / % ");
        char operator = sc.next().charAt(0);
         switch (operator)
        {
        case '+' : System.out.println(a+b);
                    break;
        case '-' : System.out.println(a-b); 
                    break;
        case '*' : System.out.println(a*b);
                    break;
        case '/' : System.out.println(a/b);
                    break;
        case '%' : System.out.println(a%b);
                    break;
}

}    
}
