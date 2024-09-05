package OOPS;

public class AbstractClasses3 {
    public static void main(String args[]){
      Chicken c1 = new Chicken();
      System.out.println(c1.color);
    }
  }
  
  
  abstract class Animal{  
      String color;
  
      Animal(){                //creating a constructor 
          System.out.println("brown");   
      }
  }
  
  class Horse extends Animal{
      Horse(){
          System.out.println("dark brown");
      }
  }
  
  class Chicken extends Horse{
      Chicken(){
          System.out.println("very dark brown");
      }
  }
