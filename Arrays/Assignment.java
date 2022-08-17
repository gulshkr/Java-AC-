package Arrays;
import java.util.*;
public class Assignment {
    //1st -> question
    //Brute force approach - O(n^2)
    // public static boolean checkIfNoIsTwice(int numbers[]){
    //     //for the 
    //     for(int i =0;i<numbers.length-1;i++){
    //         for(int j = i+1;j<numbers.length;j++){
    //             if(numbers[i] == numbers[j]){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    //Using sets approach - O(n)
    // public static boolean checkIfNoIsTwice(int numbers[]){
    //     HashSet<Integer> set = new HashSet<>();
    //     for(int i =0;i<numbers.length;i++){
    //         if(set.contains(numbers[i])){
    //             return true;
    //         } else{
    //             set.add(numbers[i]);
    //         }
    //     }
    //     return false;
    // }
    
    //2nd - Question Search an elemnt in a sorted & rotated array (Binary search)
    // public static int SearchInRoatedSortedArray(int nums[],int target){  //T.C = O(logn)
    //     int left = 0;
    //     int n = nums.length;
    //     int right = n-1;
    //     int mid;
    //     while(left<=right){
    //         mid = (left+right)/2;
    //         if(nums[mid]<=target){
    //             return mid;
    //         } else if(nums[mid]>nums[left]){
    //             if(target<=nums[mid] && target>=nums[left]){
    //                 right = mid-1;
    //             } else{
    //                 left = mid+1;
    //             }
    //         } else{
    //             if(target>nums[mid] && target<=nums[right]){
    //                 left = mid+1;
    //             } else{
    //                 right = mid-1;
    //             }
    //         }
            
    //     }
    //     return -1;
    // }

    //question - 4th How much water can be trapped between the blocks input[0,1,0,2,1,0,1,3,2,1,2,1] output - 6
    public static int trappedWaterbetweenBlocks(int height[]){
        int n = height.length;
        //callculate the leftMax boundary - using array we will find out that
        int leftMax[] = new int[n];
        leftMax[0] = height[0]; //initially leftMax is going to be zero 
        for(int i =1;i<n;i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        //calculate the rightMax boundary 
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i =n-2;i>=0;i--){   //why n-2 here - because as we have already used rightMax n-1 so it start from n-2 
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater = 0;
        //loop
        for(int i=0;i<n;i++){
            int waterLevel = Math.min(leftMax[i],rightMax[i]);
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;

    }


    public static void main(String[] args) {
        //question -1
        // int numbers[] = {1,2,3,1};
        // System.out.println(checkIfNoIsTwice(numbers));

        //question - 2nd
        // int nums[] = {4,5,6,7,0,1,2};
        // int target = 3;
        // System.out.println(SearchInRoatedSortedArray(nums, target));


        //Question - 4th
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trappedWaterbetweenBlocks(height));
    }
    
}
