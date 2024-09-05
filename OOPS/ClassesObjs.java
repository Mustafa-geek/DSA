package OOPS;

public class ClassesObjs{
    public static void main(String args[]){
        Pen p1 = new Pen();            //creating object p1

        p1.setcolor("blue");
        System.out.println(p1.color);

        p1.settip(5);
        System.out.print(p1.tip);
    }
}
class Pen
{
 String color;
 int tip;
    void setcolor(String newcolor){
            color = newcolor; 
        }

     void settip(int newtip){
            tip = newtip;
        }
}
