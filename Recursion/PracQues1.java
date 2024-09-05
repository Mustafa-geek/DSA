package Recursion;

public class PracQues1 {
    public static void  repOcc(int arr[], int key, int i ){

        if(i == arr.length){
            return;
        }
        if(arr[i] == key){
            System.out.println(i);
        }

     repOcc(arr, key, i+1); 

    }

    
    public static void main(String args[]){
        int arr [] = {1,2,3,4,2,2};
        repOcc(arr, 2, 0);
    }
}

//Question1 : For a given integer array of size N.
//You have to find all the occurrences(indices) of a given element(Key) and print them.
//Use recursivefunction to solve this problem.
//Sample Input: arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2},key = 2
//Sample Output: 1 5 7 8