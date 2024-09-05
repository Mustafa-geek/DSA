package Functions;

public class DecToBin { 
    public static void DectoBin(int dec){
       int  mynum=dec;
        int binarynum = 0;
        int pow = 0;
         int rem ;

         while(dec>0){
            rem=dec%2;
            binarynum=binarynum + (rem * (int)Math.pow(10,pow));
            pow++;
            dec=dec/2;

         } 
         System.out.println("decimal number " + mynum + " in binary number is  " + binarynum);
    }
    public static void main(String args[]){
        DectoBin(5);
    }
}
