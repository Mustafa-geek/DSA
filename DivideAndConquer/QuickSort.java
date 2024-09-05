package DivideAndConquer;

public class QuickSort {
    public static void quickSort(int arr[],int low,int high){
        if(low>=high){
            return;
        }

        int PIndex = quick(arr,low,high);         //partition of the array
        quickSort(arr, low,PIndex-1);               //again calling from low to partition      
        quickSort(arr, PIndex+1, high);           //again calling from partition to high
    }

    public static int quick(int arr[],int low,int high){
        int pivot = arr[low];
        int i = low;
        int j = high;

        while(i<j){               //always use i,j instead of low,high cuz we are performing inside things using i,j
            
            while(arr[i] <= pivot && i<=high-1){
                i++;
            }

            while(arr[j] >= pivot && j>=low+1){
                j--;
            }
            
            if(i<j){          //again chcking low<high cuz above stmts i & j incremented
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;                // swapping values of arr[i] ,arr[j]
            }
        }

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;                 //swapping pivot ,arr[j]
        return j;                      //returning the pivot after putting to its correct place 

    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]){
        int arr[] = {6,3,9,8,2,5};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
    
}
