package Loop;
import java.util.*;
public class For {
    public static void main(String[] args) {
        // for(int lines=1;lines<=4;lines++ ){
        //     System.out.println("****");
        // }


        // //Print reverse of a number
        // int n = 10899;
        // while(n>0){
        //     int lastdigit = n%10;
        //     System.out.print(lastdigit+" ");
        //     n = n/10;
        // }
        // System.out.println();


        //Reverse the given number
        int n = 1089;
        int reverse = 0;
        while(n>0){
            int lastdigit = n%10;
            reverse = (reverse*10)+lastdigit;
            n = n/10;
        }
        System.out.println(reverse);
    }
    
}
