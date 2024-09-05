package GreedyAlgorithms;

public class IndianCoins {
    public static void main(String args[]){
        int arr[] = {1,2,5,10,20,50,100,500,2000};
        int value = 200;

        for(int i=arr.length-1; i>=0; i--){
            while( arr[i] <= value){
                System.out.println(arr[i]);
                value = value - arr[i];
            }
        }
    }
    
}
