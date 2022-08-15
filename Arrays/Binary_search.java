package Arrays;
import java.util.*;
public class Binary_search {
     public static int binarySearch(int numbers[],int key){
        int start = 0, end = numbers.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            //compare
            if(numbers[mid] == key){
                return mid;
            } 
            //right side of array
            if(numbers[mid]<key){
                start = mid+1;
            //left
            } else{
                end = mid-1;
            }
        }
        return -1;
     }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,7,8,10,11};
        int key = 7;
        System.out.println("The key is at index : "+binarySearch(numbers, key));
    }
    
}
