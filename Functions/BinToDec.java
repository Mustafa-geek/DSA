package Functions;

public class BinToDec {
    public static void BintoDec(int binnum){
      int mynum=binnum;  
      int decnum = 0;
      int pow = 0;

      while(binnum>0)
      {
        int lastdigit = binnum % 10;
        decnum = decnum + (lastdigit *  (int) Math.pow(2,pow));
        pow++;
        binnum = binnum/10;
      }
        System.out.println("the binary number " + mynum + " is converted to decimal " + decnum);

      
    }
    public static void main(String args[]){
        BintoDec(101);
    }
    
}
