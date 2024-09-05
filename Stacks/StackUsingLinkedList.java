package Stacks;
import java .util.*;

public class StackUsingLinkedList {
public static class stackByLL{

    public static class Node{
        Node next;
        int data;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

     static Node head = null;

    public static boolean isEmpty(){ 
        if(head == null){
            return true;
        }
        else{
            return false;
        }
    }
    
    //push
    public static void push(int data){
        Node newNode = new Node(data);
        if(isEmpty() == true){
           head = newNode;
           return ;
        }
        newNode.next = head;
        head = newNode;

    }

    //pop
    public static int pop(){
        if(isEmpty() == true){
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
    }

    //peek
    public static int peek(){
        if(isEmpty() == true){
            return -1;
        }
        return head.data;
    }
}

public static void main(String args[]){
    stackByLL s1 = new stackByLL();
    s1.push(3);
    s1.push(993);
    s1.push(445); 

    while(!s1.isEmpty()){
        System.out.println(s1.peek());
        s1.pop();
    }

}
    
}
