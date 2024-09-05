package GreedyAlgorithms;
import java.util.*;

public class ActivitySelection2 {
    public static void main(String args[]){
        int start[] = {0,1,3,5,5,8};
        int end[] = {6,2,4,7,9,9};

        //sorting
        int sorting[][] = new int[start.length][3];
        for(int i=0; i<start.length;i++){
            sorting[i][0] = i;            
            sorting[i][1] = start[i];            
            sorting[i][2] = end[i];            
        }
        Arrays.sort(sorting,Comparator.comparingDouble (o -> o[2]));

        ArrayList <Integer> ans = new ArrayList<>();

       //total times work was done
        int count = 1;  //1 cuz first wala kaisa bhi select karte
        int endtask = sorting[0][2]; //zeroth index=first task

        ans.add(sorting[0][0]); //adding index to print ans in arrqylist 
        
        for(int i=1; i<start.length; i++){
            if(sorting[i][1] >= endtask){
                count++;
                ans.add(sorting[i][0]);
                endtask = sorting[i][2];
            }

        }

        System.out.println("total count is " + count);
        for(int i=0; i<ans.size();i++){
            System.out.println("A" + ans.get(i));
        }
    }
    
}

