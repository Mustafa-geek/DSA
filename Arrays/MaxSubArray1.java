package Arrays;

public class MaxSubArray1 {
    public static void subarrays(int numbers[]){
        int currentsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for(int i=0; i<=numbers.length-1; i++){
            int start=0;
            start=i;

            for(int j=i; j<=numbers.length-1; j++){       //j=i cuz we need to print single element also
                int end=0;
                end=j;
                currentsum=0;                    //to make sure earlier subarray sum is not added int the new sum

              for(int k=start; k<=end; k++){
               currentsum += numbers[k];
               }
               System.out.println(currentsum);
               if(maxsum < currentsum){
                maxsum = currentsum;    
            }
               
            }
               
            System.out.println();
        }
        
         System.out.println("the max sum is " + maxsum); 

    }
    
    public static void main(String args[]){
        int numbers[]={6,7,8,0};
        subarrays(numbers);

    }
    
}
