package Backtracking;

public class OnArrays {
    public static void arrays(int arr[],int idx,int n){
        if(idx == arr.length){
            printArr(arr);
            return;
        }

        arr[idx] = n;     //putting numbers in dat array
        arrays(arr,idx+1,n+1);     //recursion
        arr[idx] = arr[idx] - 2;        //backtracking  (decreasing n by -2 for the new arr)

    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int arr[]= new int[5]; 
        int idx = 0;
        int n = 1;
        arrays(arr,idx,n);
        printArr(arr);

    }
    
}
