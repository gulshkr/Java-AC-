package DivideAndConquer;

public class MajorityElement {
    //1. Brute force approach T.C - O(n^2)
    // public static int countMajorityElement(int arr[]){
    //     int majorityElememts = arr.length/2;

    //     int count = 0;
    //     for(int i = 0;i<arr.length;i++){
    //         for(int j = 0;j<arr.length;j++){
    //             if(arr[i]==arr[j]){
    //                 count++;
    //             }
    //         }
    //         if(count>majorityElememts){
    //             return arr[i];
    //         }
    //     }
    //     return -1;
    // }
    
    

    public static void main(String[] args) {
        int arr[] = {2,2,1,1,1,2,2};
        System.out.println(countMajorityElement(arr));
    }
    
}
