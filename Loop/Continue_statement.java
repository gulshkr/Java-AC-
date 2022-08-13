package Loop;
import java.util.*;
public class Continue_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // for(int i= 0;i<=5;i++){
        //     if(i==3){
        //         continue;
        //     }
        //     System.out.println(i);
        // }


        //Display all numbers entered by user except multiples of 10
        do{
            System.out.println("Enter the number");
            int n = sc.nextInt();

            if(n%10==0){
                continue;
            }
            System.out.println("number was: "+n);
        } while(true);
    }
    
}
