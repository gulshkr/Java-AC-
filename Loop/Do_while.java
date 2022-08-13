package Loop;
import java.util.*;
public class Do_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int counter = 1;
        // do{
        //     System.out.println("Hello world");
        //     counter++;
        // } while(counter<=10);


        //Keep entering the number till multiple of 10
        do{
            System.out.println("enter your number:");
            int n = sc.nextInt();
            if(n%10==0){
                break;
            }
            System.out.println(n);
        } while(true);
    }
}
