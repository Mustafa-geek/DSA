package Stacks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class StockSpanProb {
    public static class Pair{
        int first;
        int second;
        public Pair(int first,int second){
            this.first = first;
            this.second = second;
        }
    }
    public static void func(int arr[],int n){
        Stack <Pair> s = new Stack<>();
        ArrayList <Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            
            if(s.isEmpty()){          //if stack is empty 
                list.add(-1);
            }

            else if(s.peek().first > arr[i]){          
                list.add(s.peek().second);
            }
            else if(s.peek().first <= arr[i]){
                while(!s.isEmpty() && s.peek().first <= arr[i]){  //popping until we getthe greater ele or stack is emptied 
                    s.pop();
                }                                //either of the 2 conditions of while hits & terminates while
                if(s.isEmpty()){                 //so checking & applying acc to the cond hit 
                    list.add(-1);
                }
                else if (s.peek().first > arr[i]){
                    list.add(s.peek().second);
                }

            }
            s.push(new Pair (arr[i],i));               //after every adding to list ,,,,we push  to stack for further comparisons    
        }                                              //arr[i](number) = first, i(index) = second
        
        for(int i=0; i<list.size();i++){
         list.set(i , i-list.get(i));        // list(i) = i - list(i);
        }
        for(int i=0; i<list.size();i++){
            System.out.print(list.get(i) + " ");
        }
    }

    public static void main(String args[]){
        int arr[] = {100,80,60,70,60,75,85};
        int n = arr.length;
        func(arr,n);
    }
    
}

