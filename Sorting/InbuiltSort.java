package Sorting;
import java.util.*;
public class InbuiltSort {
    public static void display(Integer nums[]){
        for(int i =0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer nums[] = {3,4,2,1,5};
        // Arrays.sort(nums);
        // Arrays.sort(nums,0,3);
        Arrays.sort(nums,0,3,Collections.reverseOrder()); //it on;y works on object variable only i.e Integer not int which is a primitive type

        display(nums);
    }
}
