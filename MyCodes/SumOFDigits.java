package MyCodes;
public class SumOFDigits {
    public static void sumofDigits(int n){
        int ld = 0 ;
        int sum = 0 ;
        while(n>0){
            ld = n%10;
            sum = sum + ld;
            n= n/10;
        }
        System.out.print(sum);
    }
    public static void main(String[] args) {
        sumofDigits(511);
    }
}


