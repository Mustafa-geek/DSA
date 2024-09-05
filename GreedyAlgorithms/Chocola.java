package GreedyAlgorithms;
import java.util.*;

public class Chocola {
    public static void main(String args[]){
        Integer verticalcost[] = {2,1,3,1,4};
        Integer horizontalcost[] = {4,1,2};
        
        //decreasing order of prices
        Arrays.sort(verticalcost,Collections.reverseOrder());
        Arrays.sort(horizontalcost,Collections.reverseOrder());

        int hp=1, vp=1;
        int cost = 0;
        int i=0, j=0;

        while(i < verticalcost.length && j < horizontalcost.length){ 

            if(verticalcost[i] >= horizontalcost[j]){    //vertical cut
                cost = cost + (verticalcost[i]* hp);
                vp++;
                i++;
            }

            else{  //horizontal cut
                cost = cost + (horizontalcost[j] * vp);
                hp++;
                j++;
            }
        }

        while(i<verticalcost.length){
            cost = cost + (verticalcost[i]* hp);
            vp++;
            i++;
        }

        while(j < horizontalcost.length){
            cost = cost + (horizontalcost[j] * vp);
            hp++;
            j++;
        }

        System.out.print("cost " + cost);



    }
    
}
