package Bitmanipulation;
import java.nio.channels.NetworkChannel;
import java.util.*;
public class GetIthBit {
    //we will find what is on the ith position of any number like for 10 - 1010 - here 2nd bit is 0 
    public static int getIthBit(int n,int i){
        int bitMask = 1<<i;
        if((n&bitMask)==0){
            return 0;
        } else{
            return 1;
        }
    }
    //set ith bit
    public static int setIthBit(int n,int i){
        int bitMask = 1<<i;
        return n|bitMask;
    }

    //clear ith bit
    public static int clearIthBit(int n,int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    //update ith bit
    public static int updateIthBit(int n, int i, int newBit){
        if(newBit==0){
            return clearIthBit(n, i);
        } else{
            return setIthBit(n, i);
        }

        // n = clearIthBit(n, i);
        // int bitMask = newBit<<i;
        // return n | bitMask;
    }

    //clear last i bit
    public static int clearLastIBit(int n,int i){
        int bitMask = ~0<<i;
        return n & bitMask;
    }

    //Clear Range of bits 
    public static int clearRangeofBits(int n,int i,int j){
        int a = (~0)<<(j+1);
        int b = (1<<i) - 1;
        int bitMask = a|b;
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(getIthBit(10, 2));
        System.out.println(setIthBit(10, 2));
        System.out.println(clearIthBit(10, 1));
        System.out.println(updateIthBit(10, 2, 1));
        System.out.println(clearLastIBit(15, 2));
        System.out.println(clearRangeofBits(10, 2, 4));

    }
    
}
