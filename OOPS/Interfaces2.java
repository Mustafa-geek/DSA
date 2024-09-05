package OOPS;

public class Interfaces2 {
    public static void main(String args[]){
        Bear b1 = new Bear();
        b1.eat();

    }
    
}

interface Herbivore{
    void eat();
}

interface Carnivore{
    void eat();
}

class Bear implements Herbivore,Carnivore{
    public void eat(){
        System.out.print("bear is both herbivore and carnivore ");
    }
}