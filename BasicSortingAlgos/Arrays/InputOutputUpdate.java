package Arrays;
import java.util.*;

public class InputOutputUpdate {
    public static void main(String args[]){
        int marks[] = new int[100];                 //array declaration

        Scanner sc = new Scanner(System.in);          //input scanner class

        marks[0]=sc.nextInt();                         //taking input of marks array
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();

        System.out.println("phy marks is " + marks[0] );     //printing marks taken from input
        System.out.println("math marks is " + marks[1]);
        System.out.println("chem marks is " + marks[2]);

          marks[2] = marks[2]+1;                                       // updating an array 
          System.out.println("new chem marks after correction " + marks[2]);

          int percentage = (marks[1]+marks[2]+marks[3])/3;
          System.out.print(" percentage is " + percentage);
    }

    
}
