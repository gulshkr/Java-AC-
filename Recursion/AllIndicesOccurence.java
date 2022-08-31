package Recursion;

public class AllIndicesOccurence {
    public static void allIndicesOccurence(int arr[],int key,int i){
        //Base case
        if(i == arr.length){
            return;
        }

        //Kaam
        if(key == arr[i]){
            System.out.print(i+" ");
        }
        allIndicesOccurence(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;
        allIndicesOccurence(arr, key, 0);

    }
    
}
