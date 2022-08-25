package Function.method;
import java.util.*;
public class Practice {
    //1st Java method to compute the average of three numbers
    // public static int average(int a,int b,int c){
    //     return (a+b+c)/3;
    // }

    //2nd method named isEven acepts an int argument
    // public static boolean isEven(int n){
    //     if(n%2==0){
    //         return true;
    //     } 
    //     return false;
    // }

    //3rd check number if it is palindrome
    public static boolean isPalindrome(int n){
        n = 0;
        int myNum = n;
        int reverse = 0;
        int lastdigit;

        while(myNum!=0){
            lastdigit = myNum%10;
            reverse = reverse * 10 + lastdigit;
            myNum = myNum/10;
        } 

        if(myNum == reverse){
            return true;
        } else{
            return false;
        }
    }

    //4th search about & use the following methods of the math class in java Math.min() Math.mix() Math.sqrt() Math.pow() Math.avg() Math.abs()
    //min and max
    // public static void maxMin(int a,int b){
    //     int minimum = Math.min(a, b);
    //     int maximum = Math.max(a, b);
    //     System.out.println("Minimum is "+ minimum + " Maximum is "+ maximum);
    // }
    // public static void sQrt(int a){
    //     double squareRoot = Math.sqrt(a);
    //     System.out.println("Square root of "+ a +"is "+squareRoot);
    // }


    //5th compute the sum of the digitws in qan integer
    
    
    public static void main(String[] args) {
        // System.out.println("The average of three numbers are: "+average(2, 3, 10));
        // System.out.println("the number you enterd is : "+isEven(11));
        System.out.println(isPalindrome(0));
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(123));
        // Practice obj = new Practice();
        // obj.maxMin(2,3);
        // obj.sQrt(4);
        
    }
    
}
