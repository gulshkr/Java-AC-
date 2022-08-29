package Recursion;

public class FirstOccurence {
    public static int firstOccurence(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(key==arr[i]){
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4 ,1,5,7,8,5,3};
        System.out.println(firstOccurence(arr,5,0));

    }
    
}
