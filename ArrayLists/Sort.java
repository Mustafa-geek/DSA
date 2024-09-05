package ArrayLists;
import java.util.ArrayList;
import java.util.Collections;

public class Sort {
    public static void main(String args[]){
          ArrayList <Integer> list = new ArrayList<>();
         list.add(3);
        list.add(2);
        list.add(9);
        list.add(6);
        Collections.sort(list);  //increasing order 
        System.out.println(list);

        Collections.sort(list,Collections.reverseOrder());  //decreasing order
        System.out.print(list);
    }
}
