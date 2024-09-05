package TwoDArrays;
//print the number of 7's in an array
public class PracticeQue1 {
    public static void countingnumber(int matrix[][],int key){
        int count=0;
        for(int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    count++;
                }
                }
             }
    System.out.print(count);
}
    public static void main(String args[]){
        int matrix[][] = {{4,5,7,9},{3,8,9,7},{2,4,7,1}};
        int key = 7;
        countingnumber(matrix,key);

    }
    
}
