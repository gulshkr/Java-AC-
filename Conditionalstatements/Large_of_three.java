package Conditionalstatements;
import java.util.*;
public class Large_of_three {
    public static void main(String[] args) {
        int A = 1,B = 4, C = 4;
        if(A>=B && A>=C){
            System.out.println("Largeest is A");
        }
        else if(B>=C){
            System.out.println("Largest is B");
        }
        else{
            System.out.println("Largest is C");
        }
    }
    
}
