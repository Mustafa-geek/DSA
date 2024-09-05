package Arrays;

public class ArrayAsArgument {
    public static void update(int marks[]){


        for(int i=0; i<marks.length; i++){                    // marks[0] = marks[0]+7;
                  marks[i] = marks[i]+7;                       // marks[1] = marks[1]+7;
         }                                                     // marks[2] = marks[2]+7; 
    }
    
    public static void main(String args[]){
        int marks[]= {87,98,97};
        update(marks);              //calling update function

        //print our marks 
        for(int i=0; i<marks.length; i++)                            
        System.out.println(marks[i]); 

    }
}
