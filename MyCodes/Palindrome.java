package MyCodes;

public class Palindrome {
    public static void isPalindrome(int n){
        int check = n;
        int palindrome = 0;
        int lastdigit=0;
       int pow=2;         // since power needs to decrease
       
        while(n>0){
            lastdigit = n%10;
            palindrome = palindrome + lastdigit*(int)Math.pow(10,pow);
            n=n/10;
            pow--;
        }
        

        if(check==palindrome){
            System.out.print("true");
        }
        else{
            System.out.println("false");
        }
        
    
    }

    public static void main(String[] args) {
        isPalindrome(121);
    }
}
