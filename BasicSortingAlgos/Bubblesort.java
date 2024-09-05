package BasicSortingAlgos;

public class Bubblesort {
    public static void bubblesort(int arr[]){

        for(int turns=0; turns<=arr.length-2; turns++){               //arr.length=n
            for (int j=0; j<=arr.length-2-turns; j++){

                if ( arr[j] > arr[j+1] ){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0; i<=arr.length-1; i++){
            System.out.print(arr[i]);
        }

    }
    public static void main(String args[]){
        int arr[] = {5,7,8,9,0};
        bubblesort(arr);
    }
    
}
