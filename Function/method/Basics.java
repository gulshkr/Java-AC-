package Function.method;
import java.util.*;
//function with no parameter
// public class Basics {
//     //Syntax for function
//     public static void printHello(){
//         System.out.println("Hello world");
//     }
//     public static void calculateSum(int num1,int num2){
//        int sum = num1+num2;
//         System.out.println("sum is : "+sum);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         printHello();
//         calculateSum(a,b);
//     }

    

//function with  parameter
public class Basics {
    //Syntax for function
    public static void printHello(){
        System.out.println("Hello world");
    }
    public static int calculateSum(int num1,int num2){
       int sum = num1+num2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        printHello();
        int sum = calculateSum(a,b);
        System.out.println("sum is: "+sum);
    }

    
}
