package ArrayLists;
import java.util.*;

public class Swap {
    public static void swap(ArrayList<Integer>list, int idx1,int idx2){
        int temp;
        temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);

    }
    public static void main(String args[]){
        ArrayList <Integer> list = new ArrayList<>();
         list.add(3);
        list.add(2);
        list.add(9);
        list.add(6);
        int idx1 = 0,idx2 = 1;
        System.out.println(list);
        swap(list,idx1,idx2);
        System.out.print("after swapping " + list);


    }
    
}
