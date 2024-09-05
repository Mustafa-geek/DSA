package Arrays;

public class Reverse {
    public static void reverse(int numbers[]){
    int start=0 , end=numbers.length - 1 ;
    while(start<end){
        int temp;
        temp=numbers[start];
        numbers[start] = numbers[end];
        numbers[end] = temp;
        start++;
        end--;
     }
   
    }
    public static void main(String args[]){
        int numbers[] = {4,6,8,9};
        reverse(numbers);            //first calling the function
        for(int i=0; i<=numbers.length; i++){     //then printing th values
            System.out.print(numbers[i] + "    ");
        }
        System.out.println();

    }
    
    
}
