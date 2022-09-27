package GreedyAlgorithm;
import java.util.*;
//Chacola problem - for more info refer to note page no 354
public class ChacolaProblem {
    public static void main(String[] args) {
        int n = 4, m = 6;
        Integer costVer[] = {2,1,3,1,4};  //m-1   // '|' Straight line - COst of vertical
        Integer costHor[] = {4,1,2};     //n-1     //  '----' This is Horizontal ccost

        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int h =0, v = 0;
        int hp = 1, vp = 1; //hp - horizontal piece , vvertical piece
        int cost = 0;

        while(h < costHor.length && v < costVer.length){
            if(costVer[v]<=costHor[h]){ //horizontal cut
                cost += (costHor[h] * vp);
                hp++;
                h++;
            } else{    //vertical cut
                cost += (costVer[v]*hp);
                vp++;
                v++;
                }
            }

            while(h<costHor.length){
                cost+= (costHor[h]*vp);
                hp++;
                h++;
            }
            while(v<costVer.length){
                cost += (costVer[v]*hp);
                vp++;
                v++;
            }

            System.out.println("min cost of cuts "+cost);
        }
    }
    

