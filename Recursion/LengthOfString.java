package Recursion;
import java.util.*;
public class LengthOfString {
    public static int lengthOfString(String str){
        //base case 
        if(str.length()==0){
            return 0;
        }
        
        //Kaam
        return lengthOfString(str.substring(1))+1;
    }
    public static void main(String[] args) {
        String str = "adobe";
        System.out.println(lengthOfString(str));
    }
    
}
