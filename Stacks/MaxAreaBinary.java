
package Stacks;
import java.util.*;

public class MaxAreaBinary {

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

    public static int histogramFunc(int arr[]){   //calculating max area for histogram
        List <Integer> right = nsr(arr);
        List <Integer> left = nsl(arr);
        int maxArea=0;
        for(int i=0; i<arr.length-1; i++){
        maxArea = Math.max (maxArea,((right.get(i) - left.get(i))-1)*arr[i]);
        }
        return maxArea;
    }

    public static int binaryArea(int twoarr[][]){
        int n = twoarr.length;         //no of rows
        int m = twoarr[0].length;     //no of cols
        int[] v = new int[m];      //initialising array v with m elements-length of row
        int maxArea = 0;

        for(int i=0; i<n; i++){     
            for(int j=0; j<m; j++){
                if(twoarr[i][j] == 0){
                    v[j] = 0;
                }
                else{
                    v[j] = v[j] + twoarr[i][j];
                }
            }
            maxArea = Math.max(maxArea,histogramFunc(v));
        }
        return maxArea;
    }

    public static void main(String args[]){
        int twoarr[][] = {
            {0,1,1,0},
            {1,1,1,1},
            {1,1,1,1},
            {1,1,0,0}
        };
        System.out.print(binaryArea(twoarr));
    }
}