package Bitmanipulation;

public class Swap2No {
    
        
    public static void main(String[] args) {
        int a = 3,b = 4;
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("a = "+ a + " and  b = " +b);
    }
    
}