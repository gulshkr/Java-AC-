package Conditionalstatements;
import java.util.*;
public class Else_if {
    public static void main(String[] args) {
        int age = 11;
        if(age>=18){
            System.out.println("adullt");
        }
        else if(age>=13 && age<=17){
            System.out.println("teenager");
        }
        else{
            System.out.println("Not adult");
        }
    }
    
}
