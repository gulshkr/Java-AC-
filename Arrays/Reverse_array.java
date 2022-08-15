package Arrays;
import java.util.*;
public class Reverse_array {
    public static void reverse(int numbers[]){
        int first = 0,last = numbers.length-1;
        while(first<last){
            //swap
            int temp = numbers[last];
            numbers[last] =  numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,7,10};
        reverse(numbers);
       
        //print numbers
        for(int i = 0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
    
}
