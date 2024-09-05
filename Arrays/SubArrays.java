package Arrays;

public class SubArrays {
    public static void subarrays(int numbers[]){
        for(int i=0; i<=numbers.length-1; i++){
            int start=0;
            start=i;

            for(int j=i; j<=numbers.length-1; j++){       //j=i cuz we need to print single element also
                int end=j;

            for(int k=start; k<=end; k++){
                System.out.print(numbers[k] + " ");    // printing subbarrays from start till end  
        
            }    
                System.out.println();
            }
            System.out.println();
        }

    }
    
    public static void main(String args[]){
        int numbers[]={1,4,5,7};
        subarrays(numbers);

    }
}
