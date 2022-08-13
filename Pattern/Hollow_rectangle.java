package Pattern;
import java.util.*;
public class Hollow_rectangle{
    public static void hollow_rectangle(int totRows, int totCols){
        //outer loop
        for(int i = 1;i<=totRows;i++){
            //inner - columns
            for(int j = 1;j<=totCols;j++){
                //cell - (i,j)
                if(i == 1|| i==totRows || j ==1 || j== totCols){
                    //boundary cells
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the no of rows and columns : ");
        Scanner sc = new Scanner(System.in);
        int totRows = sc.nextInt();
        int totCols = sc.nextInt();
        hollow_rectangle(totRows, totCols);
    }
}