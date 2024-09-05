package GreedyAlgorithms;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String args[]){
        int value[] = {60,100,120};
        int weight[] = {10,20,30};
        int W = 50;

        //2-d array
        double array[][] = new double[value.length][2];
        for(int i=0; i<array.length; i++){
            array[i][0] = i;   //index
            array[i][1] = value[i]/(double)weight[i]; //ratio
        }
        Arrays.sort(array,Comparator.comparingDouble (o -> o[1]));
        //above func arranged ratio in ascending order

        int capacity = W;
        double answerValue = 0;

        //reverse for loop as we decreasing ratio 
        for(int i=array.length-1; i>=0; i--){
            int index = (int)array[i][0];

            if(capacity >= weight[index]){
                capacity = capacity - weight[index];
                answerValue = answerValue + value[index];
            }
            else{
                answerValue = answerValue + (array[i][1] * capacity);
                capacity = 0 ;
                break;
            }
        }

        System.out.println("Final Value is " + answerValue);
    }
    
}
