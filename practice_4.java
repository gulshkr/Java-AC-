import java.util.*;
public class practice_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1st:  Get a number from user and print whether it is +ve or -ve
        // int number = sc.nextInt();
        // if(number<0){
        //     System.out.println("It is negative");
        // } else{
        //     System.out.println("It is positive");
        // }

        //2nd: You have a fever if your temperature is above 100 and otherwise prints You don't have a fever
        // double temp = 103.5;
        // if(temp>100){
        //     System.out.println("you have fever");
        // } else{
        //     System.out.println("you don't have fever");
        // }


        //3rd: Write a Java program to input week number (1-7) and print day of week name using switch case
        // System.out.println("enter the week (1-7) : ");
        // int week = sc.nextInt();
        // switch(week){
        //     case 1 : System.out.println("Monday");
        //         break;
        //     case 2 : System.out.println("Tuesday");
        //         break;
        //     case 3 : System.out.println("Wednesday");
        //         break;
        //     case 4 : System.out.println("Thursday");
        //         break;
        //     case 5 : System.out.println("Friday");
        //         break;
        //     case 6 : System.out.println("Saturday");
        //         break;
        //     case 7 : System.out.println("Sunday");
        //         break;
        //     default: System.out.println("Invalid input: Please enter the eweek number between (1-7) ");
        // }


        //4th: What will be the value of x & y in the following program
        // int a=63,b=36;
        // boolean x= (a<b)?true:false;
        // System.out.println(x);
        // int y= (a>b)?a:b;
        // System.out.println(y);


        //5th: write a java proogram that takes a year from the user and print whether that year is a leap year or not
        System.out.println("Input the year: ");
        int year = sc.nextInt();

        boolean x = (year % 4)==0;
        boolean y = (year % 100) !=0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));
        if(x && (y||z)){
            System.out.println(year +" is a leap year");
        } else{
            System.out.println(year +" is not leap year");
        }
    }
    
}
