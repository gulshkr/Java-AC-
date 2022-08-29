package Recursion;

public class AddNNatural {
    public static int calcSum(int n){
        if(n==1){
            return 1;
        }
        int snm1 = calcSum(n-1);
        int sumn = n + snm1;
        return sumn;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(calcSum(n));
    }
    
}
