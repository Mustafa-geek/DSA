package OOPS;

public class Hirarchialnheritance {
    public static void main(String args[]){
         Mammals human = new Mammals();
        human.eat();
        
    }
}
   
   //parent class
   class Animal{
     String color;
   
     void eat(){
   System.out.println("eats");
   }
     void breathe(){
     System.out.println("breathes");
     }
   
   }
   
   //derived class
   class Mammals extends Animal{
    int legs;

    void birth(){
        System.out.println("mammals does not lay eggs");
    }
} 

//derived class
class Bird extends Animal{
    int wings;

    void fly(){
        System.out.println("fly");
    }
} 

 //derived class
 class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("swim");
    }
}


   
