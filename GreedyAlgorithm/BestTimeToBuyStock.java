package GreedyAlgorithm;
import java.util.*;
//Best time to buy and sell stock  - for more info notes page no 353
public class BestTimeToBuyStock {
    static int bestTimeTOBuyOrSell(int prices[],int n){
        int buy = prices[0],max_profit = 0;
        for(int i =0;i<n;i++){

            if(buy>prices[i]){
                buy = prices[i];
            }else if(prices[i]-buy>max_profit){
                max_profit = prices[i]-buy;   //selling price profit = selling price - buying price
            }
        }
        return max_profit;
    }
    public static void main(String[] args) {
        // int prices[] = {7,6,4,3,1};
        int prices[] = {7,1,5,3,6,4};
        int n = prices.length;
        System.out.println(bestTimeTOBuyOrSell(prices, n));

    }
    
}
