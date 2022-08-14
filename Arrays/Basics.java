package Arrays;
import java.util.*;
public class Basics {
    public static void update(int marks[]){
        for(int i =0;i<marks.length;i++){
            marks[i] = marks[i]+1;
        }
    }
    public static void main(String[] args) {
        // int marks[]=new int[50];
        int numbers[]  = {1,2,3};
        String fruits[] = {"litchi","mango","apple"};
        Scanner sc = new Scanner(System.in);
        // int phy;
        // phy = sc.nextInt();

        // System.out.println("length of array "+marks.length);

        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();

        // System.out.println("Phy : "+ marks[0]);
        // System.out.println("Che : "+ marks[1]);
        // System.out.println("Eng : "+ marks[2]);

        int marks[] = {24,34,45};
        int nochangeable = 5;
        update(marks);

        //print our marks
        for(int i =0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
    
}
