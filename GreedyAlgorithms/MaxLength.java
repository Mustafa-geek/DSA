package GreedyAlgorithms;
import java.util.*;

public class MaxLength {
    public static void main(String args[]){
        int pairs[][] = {{5,24},{39,60},{5,28},{27,40},{50,90}};

        //arranging end times in ascending order
        Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));

        int lastend = pairs[0][1];  //selecting 1st pair
        int ans = 1;    //1 cuz 1st pair slect kare na


        for(int i=0; i<pairs.length; i++){
            if(pairs[i][0] >= lastend){
                ans ++;
                lastend = pairs[i][1];
            }
        }
        System.out.print("The maximum length of pairs formed is " + ans);
    }
    
}
