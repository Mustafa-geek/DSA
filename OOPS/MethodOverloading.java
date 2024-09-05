package OOPS;

public class MethodOverloading {
    public static void main(String args[]){

      Calculator c1 = new Calculator();
      System.out.println(c1.sum(1,2));
      System.out.println(c1.sum(3,4,5));
      System.out.println(c1.sum((float)1.2, (float)6.6)) ;
    }
    
}

class Calculator{

    int sum(int a , int b){
        return a+b;
    }
    int sum(int a , int b, int c){
        return a+b+c;
    }
    float sum(float a , float b){
        return a+b;
    }
}