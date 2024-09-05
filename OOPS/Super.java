package OOPS;

public class Super {
    public static void main(String args[]){
        Horse h1 = new Horse();

    }
}

class Animal{
    Animal(){
        System.out.println("animal constuctor is called ");
    }
}

class Horse extends Animal{
    Horse(){
        super();
        System.out.println("horse constructor is called ");
    }
}