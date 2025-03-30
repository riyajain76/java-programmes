import java.util.*;
public class BuySellStock {
    public static int buySellStock(int prices[]){
        if(prices == null || prices.length == 0) {
            return 0;
        }

        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0;i<prices.length;i++){
            if(buyPrice<prices[i]){ //profit
                int profit = prices[i]-buyPrice;//todays profit
                maxProfit = Math.max(maxProfit,profit);
            }else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(buySellStock(prices));

    }
}
