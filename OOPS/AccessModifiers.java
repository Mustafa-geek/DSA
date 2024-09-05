package OOPS;

public class AccessModifiers {
    public static void main(String args[]){
        BankAccount ba1 = new BankAccount();

        ba1.username = "khazi";  //it is public 
        System.out.print(ba1.username);

        //ba1.password = "abcd";      //this is not possible cuz it is private
         
        ba1.setpasword("abc");
        //System.out.print(ba1.password);    //printing/accessing also not possible cuz of private
    }   
}

class BankAccount{
    public String  username;
    private String password;
    
     public void setpasword(String pwd){
        password = pwd;
     }

}
