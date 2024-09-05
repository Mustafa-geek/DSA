package GreedyAlgorithms;
import java.util.*;

public class ActivitySelection {
    public static void main(String args[]){
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        ArrayList <Integer> ans = new ArrayList<>();

       //total times work was done
        int count = 1;  //1 cuz first wala kaisa bhi select karte
        int endtask = end[0]; //zeroth index=first task

        ans.add(0);
        
        for(int i=1; i<start.length; i++){
            if(start[i] >= endtask){
                count++;
                ans.add(i);
                endtask = end[i];
            }

        }

        System.out.println("total count is " + count);
        for(int i=0; i<ans.size();i++){
            System.out.println("A" + ans.get(i));
        }
    }
    
}
