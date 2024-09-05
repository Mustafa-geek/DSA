package Functions;

public class Swap {
    
    public static void swap(int a, int b) {
        int temp;
        temp = a;                         
        a = b;
        b = temp;
        System.out.println("a is " + a);
        System.out.print("b is " + b);
    }
    public static void main(String args[]) {
        int a = 5; int b = 3;
        swap(a,b);                    //if printing statements are written here in the main instead of the swap function
    }                                   //then values are not swapped as copyy of values are used in swap function
                                            //System.out.println("a is " + a);
                                            //System.out.print("b is " + b);
}
