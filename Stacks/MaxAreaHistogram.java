package Stacks;
import java.util.*;

public class MaxAreaHistogram {

    public static class Pair{
        int first;
        int second;
        public Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }
    
    public static List<Integer> nsr(int arr[]){   //nsr = nearest smallest right
        int n = arr.length;
        int pseudoindex = n;
        Stack <Pair> s = new Stack<>();
        List <Integer> list = new ArrayList<>(); 

        for(int i=n-1; i>=0; i--){
            if(s.isEmpty()){
             list.add(pseudoindex);
            }
            else if (s.peek().first < arr[i]){
            list.add(s.peek().second);
            }
            else if(s.peek().first >= arr[i]){
                while(!s.isEmpty() && s.peek().first >= arr[i]){
                    s.pop();
                }
                if(s.isEmpty()){
                    list.add(pseudoindex);
                }
                else{
                    list.add(s.peek().second);
                }
            }
            s.push(new Pair(arr[i],i));
        }
        Collections.reverse(list);
        return list;
    }

    public static List<Integer> nsl(int arr[]){    //nsl = nearest smallest at left 
        int pseudoindex = -1;
        int n = arr.length;
        Stack <Pair> s = new Stack<>();
        ArrayList <Integer> list = new ArrayList<>();

        for(int i=0; i<n;i++){
            if(s.isEmpty()){
                list.add(pseudoindex);
            }
            else if(s.peek().first < arr[i]){
                list.add(s.peek().second);
            }
            else if (s.peek().first >= arr[i]){
                while(!s.isEmpty() && s.peek().first > arr[i]){
                    s.pop();
                }
                if(s.isEmpty()){
                    list.add(pseudoindex);
                }
                else{
                    list.add(s.peek().second);
                }
            }
            s.push(new Pair(arr[i],i));
        }
        return list;
    }

    public static int histogramFunc(int arr[]){
        List <Integer> right = nsr(arr);
        List <Integer> left = nsl(arr);
        int maxArea=0;
        for(int i=0; i<arr.length-1; i++){
        maxArea = Math.max (maxArea,((right.get(i) - left.get(i))-1)*arr[i]);
        }
        return maxArea;
    }

    public static void main(String args[]){
        int arr[] = {6,2,5,4,5,1,6};
        System.out.print(histogramFunc(arr));
    }
}
