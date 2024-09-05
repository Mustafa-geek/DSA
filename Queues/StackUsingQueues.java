package Queues;
import java.util.*;

public class StackUsingQueues {

    public static class Stack{
       static Queue <Integer> q1 = new LinkedList<>();        
       static Queue <Integer> q2 = new LinkedList<>();  
        
        public static boolean Empty(){
            if(q1.isEmpty() && q2.isEmpty()){
                return true;
            }
            else{
                return false;
            }
        } 

        //push
        public static void push(int data){
            if(!q1.isEmpty()){  //first queue
                q1.add(data);
            }
            else{       //second queue
                q2.add(data);
            }
        }

    
        public static int pop(){
            int lastele = -1;

            //first queue
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    lastele = q1.remove();
                    if(q1.isEmpty()){
                        break;
                    }
                    else{
                        q2.add(lastele);
                    }
                }

            }

            else{
                //second queue
                while(!q2.isEmpty()){
                    lastele = q2.remove();
                    if(q2.isEmpty()){
                        break;
                    }
                    else{
                        q1.add(lastele);
                    }
                }
            }
            

         return lastele;
        }

        public static int peek(){
            int lastele = -1;

            //first queue
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    lastele = q1.remove();
                    q2.add(lastele);
                }

            }

            else{
                //second queue
                while(!q2.isEmpty()){
                    lastele = q2.remove();
                    q1.add(lastele);
                }
            }

         return lastele;
        }
    }

    public static void main(String args[]){
        Stack s1 = new Stack();
        s1.push(1);
        s1.push(2);
        s1.push(3);

        while(!s1.Empty()){
            System.out.println(s1.peek());
           s1.pop();
        }
    }
    
}
