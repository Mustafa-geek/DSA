package TwoDArrays;

public class PracticeQue2 {
    public static void sumsecondrow(int matrix[][]){
         int sum=0;
         int row=1;
         int column=matrix[0].length;

         for(int j=0; j<column;j++){
            sum+=matrix[row][j];
        }
        System.out.print(sum);
    }
    public static void main(String args[]){
    int matrix[][] = {{4,5,7,9},{1,1,1,2}};
    sumsecondrow(matrix);
}
    
}
