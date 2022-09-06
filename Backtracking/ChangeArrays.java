package Backtracking;

public class ChangeArrays {
    public static void changeArrays(int arr[],int i,int val){
        //Base Case 
        if(i==arr.length){
            printArray(arr);
            return;
        }
        //Recursion(kaam)
        arr[i] = val;
        changeArrays(arr, i+1, val+1);
        arr[i] = arr[i]-2;
    }
    public static void printArray(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArrays(arr, 0, 1);
        printArray(arr);
    }
    
}
