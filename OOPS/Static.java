package OOPS;

public class Static {
    public static void main(String args[]){

        Student s1 = new Student();
        s1.Schoolname = "wisdom";
        
        Student s2 = new Student();
        System.out.println(s2.Schoolname); /// here though we gave no value to s2.schlname still s1.schname will be saved in s2.schlname as it is static in our class
        
        

    }
    
}

class Student{
     String name;
     int marks;

     static String Schoolname;

    void setname(String name){
        this.name = name;
    }

    String getname(){
        return this.name;
    }
}
