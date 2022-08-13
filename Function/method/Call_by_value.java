package Function.method;
import java.util.*;
public class Call_by_value {
    public static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
    }
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        swap(a,b);
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
    
}
