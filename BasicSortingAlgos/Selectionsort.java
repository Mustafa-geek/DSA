package BasicSortingAlgos;

public class Selectionsort {
    public static void selectionsort(int arr[]){
        for(int i=0; i<arr.length; i++){
            int minpos = i;
            for(int j=i+1; j<arr.length; j++){     // j=i+1 cuz it is start of unsorted array

               if (arr[minpos]>arr[j]){
                minpos=j;
               }
            }
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
            System.out.print(arr[i]);
        }
        //for(int i=0;i<=arr.length-1;i++){
           // System.out.print(arr[i]);}
        }
    
    public static void main(String args[]){
        int arr[] = { 5,4,1,2,3};
       selectionsort(arr);
    }
    
}
