package Bitmanipulation;
import java.util.*;
public class OddEven {
    public static void oddOrEven(int n){
        int bitMask = 1;   //you can create any variable name num, or bitMask
        if((n&bitMask)==0){
            System.out.println("Even number");
        } else{
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args) {
        oddOrEven(3);
        oddOrEven(0);
        oddOrEven(1);
        oddOrEven(14);
    }
    
}
