package OOPS;

public class DeepCopyConstructor {  public static void main(String args[]){
    Student s1 = new Student();
    s1.name = "Shradha";
    s1.roll = 222;
    s1.password = "abcde";
    s1.marks[0]=100;
    s1.marks[1]=200;
    s1.marks[2]=300;


    Student s2 = new Student(s1);
    s2.password = "eeeeee";

    s1.marks[2]=88;

    for(int i=0; i<3; i++){
        System.out.println(s2.marks[i]);
    }
}

}

class Student{
String name;
String password;
int roll;
int marks[];

//deep copy constructor
Student(Student s1){
    marks = new int [3]; 
    this.name = s1.name;
    this.roll = s1.roll;
    for(int i=0; i<3; i++){
        this.marks[i] = s1.marks[i];
    }
}

Student(){
    marks = new int [3]; 
    System.out.println("the constructor is called..xd");
}
Student(String name){
    marks = new int [3]; 
    this.name=name;
}
  Student(int roll){
    marks = new int [3]; 
    this.roll=roll;
  }

    
}
