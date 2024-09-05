package OOPS;

public class GettersSetters{
    public static void main(String Args[]){
        Pen p1 = new Pen();

        p1.setcolor("Blue");        //here setters are used as we need to modify the data by calling the function
        System.out.println(p1.getcolor());    // here getters are used are we neeed to return the value so in syso use get 

        p1.settip(6);
        System.out.println(p1.gettip());
    }
}


class Pen
{
  private  String color;
  private int tip;

   String getcolor(){                    //GETTERS
      return this.color;
    }
    int gettip(){
        return this.tip;
    }
    
    void setcolor(String newcolor){
            this.color = newcolor;            //SETTERS
       }
    void settip(int newtip){
        this.tip = newtip;
    }
} 