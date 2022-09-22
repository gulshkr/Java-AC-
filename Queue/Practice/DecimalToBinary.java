package Queue.Practice;
import java.util.*;
//Given a number N. the task is to generate and print all binary numbers with decimal values from 1 to N; ex - N = 2 output- 1,10
public class DecimalToBinary {
    public static void decimalToBinary(int n){
        Queue<String> q = new LinkedList<>();
        q.add("1");
        for(int i =0;i<n;i++){
            String s1 = q.peek();
            q.remove();
            System.out.println(s1);
            String s2 = s1;
            q.add(s1+"0");
            q.add(s2+"1");
        }
    }
    public static void main(String[] args) {
        int n =10;
        decimalToBinary(n);
    }
    
}
