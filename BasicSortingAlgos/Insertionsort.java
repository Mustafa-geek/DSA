package BasicSortingAlgos;
public class Insertionsort {
    public static void insertionsort(int arr[]){

        for(int i=1; i<arr.length; i++){      //unsorted part

            int current = arr[i];            //the element in the unsorted part to br compared with
            int j=i-1;                       //sorted part

            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }

            arr[j+1]=current;                   //if current>arr[j]
        }
}
public static void printarr(int arr[]){
    for(int i =0; i<=arr.length-1; i++){
        System.out.print(arr[i] + " ");
    }
}
    public static void main(String args[]){
        int arr[] = {7,8,3,1,2};
        insertionsort(arr);
       printarr(arr);
    }
    
}
