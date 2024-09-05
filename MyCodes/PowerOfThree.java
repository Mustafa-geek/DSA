package MyCodes;

public class PowerOfThree {     
    public static boolean isPowerOfThreeee(int n) {        //My method
    int power= 0;
    while(power<n && n>0){
      int x = (int)Math.pow(3,power);
      if(x==n){
          return true;
      }
      power++;
      
    }
    return false;
    
}

    public static boolean isPowerOfThree(int n) {      //leetcode method
          if(n==0 ){
           return false;
          }
          if(n==1){
            return true;
          }
        else {
            if(n%3==0 && isPowerOfThree(n/3)){
            return true;
            }
        else {
        return false; 
        }
    }
    }

public static void main(String[] args) {
System.out.println(isPowerOfThree(27));
}
    
}
