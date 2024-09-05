package BitManipulation;

public class ClearLastibit {
    public static int clearlastibit(int n,int i ){
        int bitmask = (~0)<<i;
        return n & bitmask;

    }
    public static void main(String args[]){
        System.out.println(clearlastibit(15,2));
    }
    
}
