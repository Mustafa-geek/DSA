package OOPS;

public class AbstractClasses2 {
  public static void main(String args[]){
    Horse h = new Horse();
    System.out.println(h.color);
  }
}


abstract class Animal{  
    String color;

    Animal(){                //creating a constructor 
        System.out.println("brown");   
    }
}

class Horse extends Animal{
    void changecolor(){
        System.out.println("dark brown");
    }
}

class Chicken extends Animal{
    void changecolor(){
        System.out.println("very dark brown");
    }
}
