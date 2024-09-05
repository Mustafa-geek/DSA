package Arrays;

public class LinearSearch {
    public static int linearsearch(int numbers[],int key){

        for(int i=0; i<numbers.length; i++){

            if (numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
      public static void main(String args[]){
       int numbers[] = {1,2,3,4,5,6,7,8};
       int key=6;
       int index = linearsearch(numbers,key);

       if (index==-1){
       System.out.println("key element not found ");
       }
       else {
       System.out.println("element found at index " + index);
       }
    }          
}   