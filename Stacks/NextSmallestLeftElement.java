package Stacks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NextSmallestLeftElement {
     public static void func(int arr[],int n){
        Stack <Integer> s = new Stack<>();
        ArrayList <Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            
            if(s.isEmpty()){          //if stack is empty 
                list.add(-1);
            }

            else if(s.peek() < arr[i]){          
                list.add(s.peek());
            }
            else if(s.peek() >= arr[i]){
                while(!s.isEmpty() && s.peek()>=arr[i]){  
                    s.pop();
                }                                //either of the 2 conditions of while hits & terminates while
                if(s.isEmpty()){                 //so checking & applying acc to the cond hit 
                    list.add(-1);
                }
                else if (s.peek()<arr[i]){
                    list.add(s.peek());
                }

            }
            s.push(arr[i]);               //after every adding to list ,,,,we push that element to stack for further comparisons    
        }
        System.out.print(list);
    }

    public static void main(String args[]){
        int arr[] = {4,5,2,10,8};
        int n = arr.length;
        func(arr,n);
    }
    
}
