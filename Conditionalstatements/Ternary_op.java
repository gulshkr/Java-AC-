package Conditionalstatements;
import java.util.*;
public class Ternary_op {
    public static void main(String[] args) {
        // int number = 4;
        
        // //ternary operator
        // String type= (number%2==0)? "even":"odd";
        // System.out.println(type);
        

        //Check if student is fail or pass
        int marks = 25;
        String reportCard = marks >=33? "PASS" : "FAIL";
        System.out.println(reportCard);
    }
}
