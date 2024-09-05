package Arrays;

public class MaxArraySum2 {
    public static void subarrays(int numbers[]){
        int currentsum=0;
        int  maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        //calculate prefix array
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i=0; i<numbers.length; i++){
            int start=0;
            start=i;

            for(int j=i; j<numbers.length; j++){    
                int end=0;
                end=j;

                currentsum = start == 0  ? prefix[end] : prefix[end] - prefix[start-1];    //ternary operator
                if(maxsum<currentsum){
                    maxsum=currentsum;
                }
               
            }
               
           
        }
        System.out.print("th maximum sum is " + maxsum);

    }
    
    public static void main(String args[]){
        int numbers[]={6,7,8,0};
        subarrays(numbers);

    }
    
}
