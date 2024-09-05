package TwoDArrays;

public class Search {
    public static boolean search(int matrix[][],int key){
        int n=3,m=3;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] == key){
                System.out.print("key element found at" + "("  + i +","+ j +  ")");
                return true;}
            }
        }
        System.out.print("key element not found");
        return false;
    }
    public static void main(String args[]){
        int matrix[][] = {{3,4,5,},{1,2,3},{7,8,9}};
        //int key= 8;
        search(matrix,7);
    }
    
}
