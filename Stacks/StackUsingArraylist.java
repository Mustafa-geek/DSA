package Stacks;
import java.util.*;

public class StackUsingArraylist {
  static class stack{
    
    static ArrayList<Integer>list = new ArrayList<>();

    static boolean isEmpty(){  //return true if its empty or else false 
      return list.size() == 0;
    }
    //push
    static void push(int data){
      list.add(data);
    }

    //pop
    static int pop(){
      if(isEmpty()){
        return -1;
      }
     int top = list.size()-1;
     list.remove(list.size()-1);
    return top;
    }

    //peek
    static int peek(){
        if(isEmpty()){
        return -1;
      }
      return list.get(list.size()-1);
    }
  }
  public static void main(String args[]){
    stack s = new stack();
    s.push(34);
    s.push(23);
    s.push(22);

    while(!s.isEmpty()){                  
      System.out.println(s.peek());
      s.pop();
    }
  }
    
}
