package Functions;

public class Product {
    public static  int product(int a,int b){
       int multiply = a*b;
        return multiply;
    }
    public static void main(String args[]){

      int result = product(3,4);       //here instead of taking vlues from the user we can pass the required values in parameters
      System.out.println(result);       
      result = product(9,9);       //again calling a function without telling its datataypes
      System.out.println(result);
    }
}
