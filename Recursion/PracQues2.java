package Recursion;

public class PracQues2 {
    public static int stringLength(String str, int index){
        if(index == str.length()){
            return index;
        }
        return stringLength(str,index+1);

    }

    public static void main(String args[]){
        String str = "mustafa";
        int index = 0;
        System.out.print(stringLength(str,index));
    }
    
}

//Question 3 :Write a program to find Length of a String using Recursion