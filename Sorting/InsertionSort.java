package Sorting;

public class InsertionSort {  //T.c O(n^2)
    public static void insertionSort(int nums[]){
        for(int i =1;i<nums.length;i++){
            int curr = nums[i];
            int prev = i-1;
            while(prev>=0 && nums[prev]>curr){
                nums[prev+1] = nums[prev];
                prev--;
            }
            //insertion
            nums[prev+1] = curr;
        }
    }
    public static void display(int nums[]){
        for(int i = 0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int nums[] = {2,3,1,5,4};
        insertionSort(nums);
        display(nums);
    }
}
