package OOPS;

public class HybridInheritance {
    public static void main(String args[]){
        Human m1 = new Human();      
       m1.birth();                               //here m1.breed is not possible as human class is derived from mammals class which is derived from animals class
        Flamingo f1 = new Flamingo();
        f1.breathe();                             

       
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
  



class Mammals extends Animal{                     //extends to animal class
   int legs;                                  
   void birth(){
       System.out.println("mammals does not lay eggs");
   }
} 
class Dog extends Mammals{                     //extends to mammals class
    String color;                                     
    void breed(){
    System.out.print("dog breeding");
    }
}
class Human extends Mammals{
    void brainly(){
        System.out.println("Humans are Intelligent");
    }

}




class Bird extends Animal{                    //extends to animal class
   int wings;
    void fly(){
       System.out.println("fly");
   }
} 
class Peacock extends Bird{                       //extends to bird calss
       void feathers(){
        System.out.println("peacock feathers are beautifull");
       }
}
class Flamingo extends Bird{
    void longlegs(){
        System.out.println("Flamingoes has long legs ");
    }
}



//derived class
class Fish extends Animal{            //extends to animal class
   int fins;

   void swim(){
       System.out.println("swim");
   }
}
class Shark extends Fish{                //extends to fish class
    void dangerous (){
        System.out.println("sharks has dangerous");
    }
}
class Tuna extends Fish{
    void snack(){
        System.out.println("i am a tuna snack");
    }
}
