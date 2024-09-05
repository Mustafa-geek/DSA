package ConditionalStmts;
import java.util.Scanner;




public class ScannerProb {
    public static void main(String args[]){
        A n1 = new A();
        n1.read();
        B n2 = new B();
        n2.total(n1.s1, n1.s2, n1.s3);
        n2.avg(totalanswer);
        
    }  
}

class A{
    int no,s1,s2,s3;
    String name;

    void read(){
        Scanner in = new Scanner(System.in);

        System.out.println("enter your name");
         name = in.nextLine();
        
         System.out.println("enter your number");
         no = in.nextInt();


        System.out.println("enter your marks of s1,s2,s3");
         s1 = in.nextInt();
         s2 = in.nextInt();
         s3 = in.nextInt();
    }
   }
    
   class B extends A{
         int total(int s1,int s2,int s3){

            int totalanswer = s1+s2+s3;
            System.out.println("total is " + totalanswer);
            return totalanswer;
         }

         void avg(int totalanswer){
            int average = (totalanswer)/3;
            System.out.println("average is " + average);
         }
   }
