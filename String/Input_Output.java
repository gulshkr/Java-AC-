package String;
import java.util.*;
public class Input_Output {
    public static void printLetters(String str){
        for(int i =0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // char arr[] = {'a','b','c','d'};
        // String str = "abcd";
        // String str2 = new String("xyz");

        // //Strings are IMMUTABLE
        // Scanner sc = new Scanner(System.in); 
        // String name;
        // name = sc.nextLine();
        // System.out.println(name);

        // String fullName = "Gulshan Kumar";
        // System.out.println(fullName.length());

        //concatenation
        // String firstName = "Gulshan";
        // String lastName = "Kumar";
        // String fullName = firstName +" "+lastName;
        // System.out.println(fullName.charAt(3));


        // printLetters(fullName);
        String s1 ="Tony";
        String s2 ="Tony";
        String s3 = new String("Tony");

        if(s1 == s2 ){
            System.out.println("Are equals: ");
        }
        else{
            System.out.println("Not Equals: ");
        }

        // if(s1 == s3 ){
        //     System.out.println("Are equals: ");
        // }
        // else{
        //     System.out.println("Not Equals: ");
        // }

        if(s1.equals(s3)){
            System.out.println("Are equals: ");
        }
        else{
            System.out.println("Not Equals: ");
        }

    }
    
}
