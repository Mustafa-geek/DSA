package Arrays;

public class AssignmentQue1 {
public static boolean same(int numbers[]){
    for(int i=0; i<numbers.length-1; i++){
        for(int j=i+1; j<numbers.length; j++){
            if (numbers[i] == numbers[j]){
                return true;
            }
        }
        
        
    }
    return false;
}
public static void main(String args[]){
    int numbers[] = {4,6,7,8,9,9};
    System.out.print(same(numbers));
}
    
}
