package Recursion;

public class RemoveDuplicates {
    public static void removeDup(String str,int idx,StringBuilder sb,boolean map[]){

        //base condition
        if(idx == str.length()){
            System.out.print(sb);
            return;
        }

        char currchar = str.charAt(idx);      //here currchar is of char type not int type 

        if(map[currchar-'a'] == true){          
            // since letter is already present in array we dont append in sb
            removeDup(str,idx+1,sb,map);
        } 

        else{
            map[currchar-'a'] = true;     
             // array ke andar value dalre ki ye value exist karao ab ..yaad rakhne ke liye for the next call
             
              removeDup(str,idx+1,sb.append(currchar),map);     //appending in new string the currentchar
        }
    }
    
    public static void main(String args[]){
        String str = "hollo";
        removeDup(str,0,new StringBuilder(),new boolean[26]);
    }
}
