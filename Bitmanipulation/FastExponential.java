package Bitmanipulation;

public class FastExponential {
    public static int fastExpo(int a,int n){  //(a = 3, n = 5 --> 3^5)
        int ans = 1;
        while(n>0){
            if((n & 1)!=0){  //check for the lSB
                ans = ans*a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(fastExpo(3, 5));
    }
    
}
