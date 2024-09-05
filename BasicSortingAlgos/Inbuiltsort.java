package BasicSortingAlgos;
import java.util.*;

public class Inbuiltsort {
    public static void main(String args[]){
         /*int arr[] = {9,5,2,0,5,7};
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
     } */
    

    Integer arr[] = {4,9,8,9,1};
    Arrays.sort(arr,0,3,Collections.reverseOrder());
    for(int i=0; i<=arr.length-1; i++){
        System.out.print(arr[i] + " ");
    }
    }
}
