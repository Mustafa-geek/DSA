package Arrays;

public class SmallestValue {
    public static int smallest(int numbers[]){
         int Smallest = Integer.MAX_VALUE;            //+infinity

         for(int i=1; i<numbers.length; i++){
            if(Smallest>numbers[i]){
                Smallest=numbers[i];
            }
         }
         return Smallest;
    }
    public static void main(String args[]){
        int numbers[] = {4,6,8,9,2,0,9};
        System.out.println("the smallest number is " + smallest(numbers));

    }
    
}
