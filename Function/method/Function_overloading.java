package Function.method;
import java.util.*;
public class Function_overloading {
    //function to calculate sum of 2 no.
    // public static int sum(int a,int b){
    //     return a+b;
    // }
    // function to calculate sum of 3 no.
    // public static int sum(int a,int b,int c){
    //     return a+b+c;
    // }

    //function to calc int sum
    public static int sum(int a,int b){
        return a+b;
    }
    //function to calc float sum
    public static float sum(float a,float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(3, 5));
        System.out.println(sum(2.4f,3.0f));
    }
    
}
