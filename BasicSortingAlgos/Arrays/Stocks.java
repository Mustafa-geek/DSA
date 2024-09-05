package Arrays;

public class Stocks {
    public static int buysellstocks(int prices[]){
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i=0; i<prices.length; i++){

            if (buyprice<prices[i]){             //profit can be obtained         
                int profit = prices[i] - buyprice ;      //prices[i]==prices of today(selling prices)
               // profit   = sellingprice - buyingprice
                maxprofit = Math.max( maxprofit,profit);
            }

            else{                
                buyprice = prices[i];       // it is better to buy today as the price is low & we can sell it in the future for a profit
             }                               //thus todays price we are putting in buyprice
        }
        return maxprofit;                 

    }
    public static void main(String args[]){
        int prices[] = {7,1,5,3,6,4};
        System.out.print(buysellstocks(prices));
    }
    
}
