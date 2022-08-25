package Bitmanipulation;

public class CalculateSetBit {
    public static int calculateSetbit(int n){
        int count = 0;
        while(n>0){
            if((n&1)!=0){  // check the LSB - (least significant bit)
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(calculateSetbit(10));
        System.out.println(calculateSetbit(15));
        
    }
    
}
