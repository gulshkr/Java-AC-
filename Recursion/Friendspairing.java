package Recursion;

public class Friendspairing {
    public static int friendsPairing(int n){
        //Base case -- for more page no 133 0r 134 of notes
        if(n==1 || n==2){
            return n;
        }

        // //choice
        // //single
        // int fnm1 = friendsPairing(n-1); // fnm1 = function of n-1

        // //pair
        // int fnm2 = friendsPairing(n-2);
        // int pairWays  = (n-1)*fnm2;

        // //total ways
        // int totWays = fnm1 + pairWays;

        // return totWays;

        //--------> or you can do it in a single line
        return friendsPairing(n-1) + (n-1)*friendsPairing(n-2);
    }
    public static void main(String[] args) {
        System.out.println(friendsPairing(3));
    }
    
}
