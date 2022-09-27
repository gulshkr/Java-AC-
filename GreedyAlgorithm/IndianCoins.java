package GreedyAlgorithm;
import java.util.*;
//Indian coins - We are given an infinite of denominations[1,2,3,5,10,50,100,500,2000] . Find min no. of coins/notes to make change for a value V.
public class IndianCoins {
    public static void main(String[] args) {
        Integer coins[] = {1,2,5,10,20,50,100,500,2000};

        Arrays.sort(coins, Comparator.reverseOrder());

        int CountOfCoins = 0;
        int amount = 500;
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i =0;i<coins.length;i++){
            if(coins[i]<= amount){
                while(coins[i]<= amount){
                    CountOfCoins++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }
        
        System.out.println("total min used coins = "+CountOfCoins);

        //print coins
        for(int i =0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
    }
    
}
