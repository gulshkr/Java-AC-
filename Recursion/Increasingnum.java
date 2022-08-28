package Recursion;

public class Increasingnum {
    // public static void printInc(int n){
    //     if(n==10){
    //         System.out.println(n);
    //         return;
    //     }
    //     System.out.print(n+" ");
    //     printInc(n+1);
    // }

    public static void printInc(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        // int n = 1;
        // printInc(n);
        int n = 10;
        printInc(n);
    }
    
}
