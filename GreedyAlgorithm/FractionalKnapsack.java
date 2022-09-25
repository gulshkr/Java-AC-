package GreedyAlgorithm;
import java.util.*;
//Given the weigths and value of N items, put these items in a knapsack of capacity w to get the maximum total value in the knapsack .. input value= [60,100,120] Weigth = [10,20,30] ans = 240
public class FractionalKnapsack {
    public static void main(String args[]){
        int weight[] = {60,100,120};
        int value[] = {10,20,30};
        int w = 50;

        double ratio[][] = new double[value.length][2];
        //0th col => idx; 1st col => ratio

        for(int i =0;i<value.length;i++){
            ratio[i][0] = i;
            ratio[i][1] = value[i]/(double)weight[i];
        }

        //asecnding order
        Arrays.sort(ratio, Comparator.comparing(o -> o[1]));

        int capacity = w;
        int finalVal = 0;
        for(int i =ratio.length-1;i>=0;i--){
            int idx = (int)ratio[i][0];
            if(capacity >= weight[idx]){
                finalVal += value[idx];
                capacity -= weight[idx];
            } else{
                //include fractional item
                finalVal += (ratio[i][1] = capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println("final val "+finalVal);
    }
    
}
