package OOPS;

public class Constructors {
    public static void main(String args[]){

        Student s1 = new Student("mustafa");  //in java it automically creates a constructor if there is no args 
        System.out.print(s1.name);
    } 
      
    
}

class Student{
    String name;
    int roll;

    Student(String name){
       this.name=name;

    }

}