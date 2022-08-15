package Arrays;
import java.util.*;
public class Largest_no {
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0;i<numbers.length;i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {2,1,0,10,11};
        System.out.println("Largest no is : "+getLargest(numbers));
    }
    
}
