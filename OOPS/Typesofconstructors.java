package OOPS;

public class Typesofconstructors {
    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student("Shradha");
        System.out.println(s2.name);
        Student s3 = new Student (123);    }
    
}

class Student {
    String name;
    int roll;

    Student(){
        System.out.print("constructor is called.....");
    }
    Student(String name){
           this.name = name;
           //System.out.println(s2.name);
    }
    Student(int roll){
        this.roll = roll;
    }
}