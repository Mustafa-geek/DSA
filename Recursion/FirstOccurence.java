package Recursion;

public class FirstOccurence {
    public static int firstOcc(int arr[], int key,int i ){   //i=index

        if(i == arr.length){
            return -1;
        }

       if(arr[i] == key){
        return i;
       }
        
        return firstOcc(arr,key,i+1);
       
    }

    public static void main(String args[]){
        int arr[] = {4,5,69,4,3,5,0,5};
        System.out.print(firstOcc(arr,5,0));
    }
    
}
