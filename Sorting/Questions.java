package Sorting;
import java.util.*;
public class Questions {
    //Question - 1 Bubble sort (in descending order)
    // public static void bubbleSort(int nums[]){
    //     //for turns
    //     int n = nums.length;
    //     for(int i =0;i<n-1;i++){
    //         for(int j =0;j<n-1;j++){
    //             if(nums[j]<nums[j+1]){
    //                 //swap
    //                 int temp = nums[j];
    //                 nums[j] = nums[j+1];
    //                 nums[j+1] = temp;
    //             }
    //         }
    //     }
    // }

    //Questionn - 2 Selection sort (in descending order)
    // public static void selectionSort(int nums[]){
    //     int n = nums.length;
    //     for(int i =0;i<n-1;i++){
    //         int minPos = i;
    //         for(int j =i+1;j<n;j++){
    //             if(nums[minPos]<nums[j]){
    //                 minPos = j;
    //             }
    //         }
    //         //swap
    //         int temp = nums[minPos];
    //         nums[minPos] = nums[i];
    //         nums[i] = temp;
    //     }
    // }

    //Question - 3 Insertion Sort (in descending order)
        // public static void insertionSort(int nums[]){
        //     int n = nums.length;
        //     for(int i =1;i<n;i++){
        //         int curr = nums[i];
        //         int prev = i-1;
        //         while(prev>=0 && nums[prev]<curr){
        //             nums[prev+1] = nums[prev];
        //             prev--;
        //         }
        //         //insertion
        //         nums[prev+1] = curr;
        //     }
        // }

    
    //Question - 4 - Counting Sort (in descending order)
    public static void countingSort(int nums[]){
        int n = nums.length;
        int largest = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            largest = Math.max(largest,nums[i]);
        }
        int count[] = new int[largest+1];
        for(int i=0;i<n;i++){
            count[nums[i]]++;
        }
        //sorting 
        int j=0;
        for(int i =n-1;i>=0;i--){
            while(count[i]>0){
                nums[j]=i;
                j++;
                count[i]--;
            }
        }
    }

    //Desplay function to print the results
    public static void display(int nums[]){
        int n = nums.length;
        for(int i =0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int nums[] ={3,6,2,1,8,7,4,3,1};
        // bubbleSort(nums);
        // selectionSort(nums);
        // insertionSort(nums);
        countingSort(nums);
        display(nums);
    }
    
}
