package Conditionalstatements;
import java.util.*;
public class Switch_stat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select the below given no.");
        System.out.println("Case 1 - 1-2 cgpa");
        System.out.println("Case 2 - 3-4 cgpa");
        System.out.println("Case 3 - 5-6 cgpa");
        System.out.println("Case 4 - 7-8 cgpa");
        System.out.println("Case 5 - 9-10 cgpa");
        System.out.println("Enter");
        int number = sc.nextInt();
        
        switch(number){
            case 1 : System.out.println("Beaten by father");
                break;
            case 2 : System.out.println("Grounded for 1 week");
                break;
            case 3 : System.out.println("Grains");
                break;
            case 4 : System.out.println("Pizza");
                break;
            case 5 : System.out.println("Pizza + Burger + Coca cola + Party");
                break;
            default : System.out.println("Invalid result");
                break;
        }
    }
}
