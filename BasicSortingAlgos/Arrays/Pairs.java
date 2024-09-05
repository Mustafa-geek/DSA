package Arrays;

 public class Pairs {
    public static void printPairs(int numbers[]){
        //int tp=0;   here global declaration it gives total number of pairs 
        for(int i=0; i<=numbers.length-1; i++){
            int current = numbers[i];
            int tp=0;

            for(int j=i+1; j<=numbers.length-1; j++){
                System.out.print( "(" + current + ","  + numbers[j] +  ")" );
                tp++;
            }
            System.out.println();
            System.out.println("total pairs are = "  +  tp );
        }    
    }
    public static void main(String args[]){
        int numbers[] = {3,5,7,9,0,8};
        printPairs(numbers);
    }
    
}
