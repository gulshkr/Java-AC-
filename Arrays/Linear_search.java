package Arrays;
import java.util.*;
public class Linear_search {
    public static int linearSearch(int numbers[],int key){
        for(int i = 0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2,3,4,56,7,7,8};
        String menu[] = {"dosa","samose","coc","frooti"};
        int key = 8;

        int index = linearSearch(numbers, key);
        if(index == -1 ){
            System.out.println("NOT FOUND");
        } else{
            System.out.println("THe key is at index : "+index);
        }
    }
    
}
