package Stacks;
import java.util.*;

public class NextGreatestRightElement {
    
    public static void func(int arr[],int n){
        Stack <Integer> s = new Stack<>();
        ArrayList <Integer> list = new ArrayList<>();
        for(int i=n-1; i>=0; i--){
            
            if(s.isEmpty()){          //if stack is empty 
                list.add(-1);
            }

            else if(s.peek() > arr[i]){     //here in condition sir taught (s.peek() > arr[i] && !s.isEmpty())  but i didnt give cuz I think its not necessary  
                list.add(s.peek());
            }
            else if(s.peek() <= arr[i]){        //here also same i didnt give 
                while(!s.isEmpty() && s.peek()<=arr[i]){  //popping until we getthe greater ele or stack is emptied 
                    s.pop();
                }                                //either of the 2 conditions of while hits & terminates while
                if(s.isEmpty()){                 //so checking & applying acc to the cond hit 
                    list.add(-1);
                }
                else if (s.peek()>arr[i]){
                    list.add(s.peek());
                }

            }
            s.push(arr[i]);               //after every adding to list ,,,,we push that element to stack for further comparisons    
        }
        Collections.reverse(list);
        System.out.print(list);
    }

    public static void main(String args[]){
        int arr[] = {1,3,2,4};
        int n = arr.length;
        func(arr,n);
    }
    
}
