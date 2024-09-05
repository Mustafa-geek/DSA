package Patterns;

public class Diamond {
    public static void diamond(int n){
        //1st half
        for(int i=1; i<=n; i++){

            for(int j=1; j<=n-i; j++){         //spaces
                System.out.print(" ");
            }

            for(int j=1; j<=(2*i)-1; j++){            //stars
                System.out.print("*"); 
            }
     
            System.out.println();
        }    
      
           for(int i=n; i>=1; i--){

              for(int j=1; j<=n-i; j++){         //spaces
               System.out.print(" ");
               }

              for(int j=1; j<=(2*i)-1; j++){            //stars
               System.out.print("*"); 
               }
                System.out.println();
            }   
    }
    
    public static void main(String args[]){
        diamond(7);
    }

}
