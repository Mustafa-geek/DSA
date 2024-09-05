package Backtracking;

public class SubString {
    public static void subStr(String str,String ans,int i){   //i=index

        //base case
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.print("null");
            }
            System.out.println(ans);
            return;
        }
        //if it takes
        subStr(str,ans+str.charAt(i),i+1);
        //if it does not take
        subStr(str,ans,i+1);
    }
    public static void main(String args[]){
        String str = "abc";
        subStr(str,"",0);
    }
}
