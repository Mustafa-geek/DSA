package OOPS;

public class AbstractClasses {
   public static void main(String args[]){

    Horse h = new Horse();
    h.eat();
    h.walk();

    Chicken c = new Chicken();
    c.eat();
    c.walk();

    //Animal a = new Animal()     we cant make this cuz it is an abstract class
   }
    
}


abstract class Animal{
    void eat(){
        System.out.println("animal is eating food");
    }
    abstract void walk();     //abstract functions have no implementations like in up func Syso
}

class Horse extends Animal{
    void walk(){
        System.out.println("horse walks on 4 legs");
    }
}

class Chicken extends Animal{
    void walk(){
        System.out.println("horse walks on 2 legs");
    }
}


