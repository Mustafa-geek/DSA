package TwoDArrays;
import java .util.*;

public class InputOutput {
    public static void main(String args[]){
        int matrix[][] = new int [3][3];          //declaration of 2-D Array
        //int m=3,n=3 ;
        int  n=matrix.length, m=matrix[0].length ;    //n=rows  m=colomns

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<n; i++ ){                 //for rows
            for(int j=0; j<m; j++){             //for colomns
                matrix[i][j]=sc.nextInt();        //taking input
            }
        }
        for(int i=0; i<n; i++ ){                 //for rows
            for(int j=0; j<m; j++){             //for colomns
                System.out.print(matrix[i][j] + " ");                   //taking output
            }
            System.out.println();
        }


    }

    
}
