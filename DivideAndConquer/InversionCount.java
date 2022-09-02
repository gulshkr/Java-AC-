package DivideAndConquer;

public class InversionCount {
    //1. Brute force -- T.C - O(n^2)
    // public static int getInversionCount(int arr[]){
    //     int n = arr.length;
    //     int invCount = 0;
    //     for(int i =0;i<n;i++){
    //         for(int j =i+1;j<n;j++){
    //             if(arr[i] > arr[j]){
    //                 invCount++;
    //             }
    //         }
    //     }
    //     return invCount;
    // }

    //2.
    public static void main(String[] args) {
        int arr[] ={1,20,6,4,5};
        System.out.println("Inversion count = "  +getInversionCount(arr));
    }
    
}
