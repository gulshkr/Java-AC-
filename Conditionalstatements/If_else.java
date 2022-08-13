package Conditionalstatements;
import java.util.*;
public class If_else {
    public static void main(String[] args) {
        int age = 17;
        if(age>=18){
            System.out.println("Adult: Drive, Vote");
        }
        if(age>13 && age<18){
            System.out.println("You're teenager");
        }
        else{
            System.out.println("Not adult");
        }
    }
}
