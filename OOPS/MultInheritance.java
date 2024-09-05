package OOPS;

public class MultInheritance {   
     public static void main(String args[]){
     Dogs bruno = new Dogs();
     bruno.eat();
     bruno.legs=4;
     System.out.print("dogs has 4 legs");
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
class Mammal extends Animal{
    int legs;

    void birth(){
        System.out.println("mammals does not lay eggs");
    }
}


//derived class
class Dogs extends Mammal
{
 String breed;
}


