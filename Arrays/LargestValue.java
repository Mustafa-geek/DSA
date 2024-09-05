package Arrays;
import java.util.*;

public class LargestValue {
    public static int  largest(int numbers[]){
        int largest=Integer.MIN_VALUE;        //- infinity

        for( int i=1; i<numbers.length; i++){
            if(largest<numbers[i]){
               largest=numbers[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int numbers[]={3,6,8,0,3,9};
        System.out.println("the greatest among given array is " + largest(numbers));  //function calling within print
    }
    
}
