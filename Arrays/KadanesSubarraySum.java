package Arrays;

public class KadanesSubarraySum {
    public static void kadanesalgo(int numbers[]){
        int currentsum = 0;
        int  maxsum = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){
         currentsum = currentsum + numbers[i];
             if (currentsum<0){
                currentsum=0;
             }
             
             maxsum = Math.max(currentsum,maxsum);        //comparing cuurentsum & maxsum which has higher value &Aassigning higher valur to maxsum
         }
             System.out.print("the maximum sum is " + maxsum);
    }
    public static void main(String args[]){
        int numbers[] = {3, -1,3,-2};
        kadanesalgo(numbers);
    }
    
    
}
