package Conditionalstatements;
import java.util.*;
public class Even_odd {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    if(number%2==0){
        System.out.println("Even number");
    } else{
        System.out.println("Odd number");
    }
}
}
