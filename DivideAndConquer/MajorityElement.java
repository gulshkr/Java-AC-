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
    
    //2nd - approach - using Divide and conquer - merge sort
    public static int countInRange(int nums[],int num,int si,int ei){
        int count = 0;
        for(int i=si;i<=ei;i++){
            if(si==ei){
                count++;
            }
        }
        return count;
    }

    public static int majorityElememtRec(int nums[],int si,int ei){
        //Base case - the only element in an array of size 1 is the majority
        if(si==ei){
            return nums[si];
        }

        //Recurse the element  in two halves right and left of this slice
        int mid = si+(ei-si)/2;

        int left = majorityElememtRec(nums, si, mid);
        int right = majorityElememtRec(nums, mid+1, ei);

        //if the two halves agree on the majority element, return the element

        if(left == right){
            return left;
        }

        //Otherwise, count each element and return the "winner"

        int leftCount = countInRange(nums, left,si,ei);
        int rightCount = countInRange(nums, right,si,ei);

        //Compare both leftCount and rightCount and return left as winner
        return leftCount>rightCount ? left : right;
    }

    public static int majorityElement(int nums[]){
        return majorityElememtRec(nums, 0, nums.length-1);
    }

    public static void main(String[] args) {
        //1st approach - brute force
        // int arr[] = {2,2,1,1,1,2,2};
        // System.out.println(countMajorityElement(arr));

        //2nd approach - divide and conquer using merge sort
        // int nums[] = {2,2,1,1,1,2,2};
        int nums[] = {3,3,4};
        System.out.println(majorityElement(nums));
    }
    
}
