//Apply merge sort to sort an array of strings(Assume that all characters are in all the strings are in the lowercase)
package Recursion;

public class StringMergeSort {
    //si - starting index , ei - ending index
    public static String[] mergeSort(String arr[],int si,int ei){
        //Base case
        if(si==ei){
            String A[] = {arr[si]};
            return A;
        }

        //Kaam
        int mid = si+(ei-si)/2;
        String arr1[] = mergeSort(arr, si, mid);
        String arr2[] = mergeSort(arr, mid+1, ei);

        String arr3[] = merge(arr1,arr2);
        return arr3;
    }

    static String[] merge(String arr1[],String arr2[]){
        int m = arr1.length;
        int n = arr2.length;

        String arr3[] = new String[m+n];

        int idx =0;
        int i = 0;
        int j = 0;

        //When both left and right are smaller
        while(i<m && j<n){
            if(isAlphabeticallySmaller(arr1[i],arr2[j])){
                arr3[idx] = arr1[i];
                i++;
                idx++;
            } else{
                arr3[idx] = arr2[j];
                j++;
                idx++;
            }
        }

        //when only one side right is smaller then
        while(i<m){
            arr3[idx] = arr1[i];
            i++;
            idx++;
        }

        while(j<m){
            arr3[idx] = arr2[j];
            j++;
            idx++;
        }
        return arr3;

    }
        //Return true if str1 appears before str2 in alphabetical order
        static boolean isAlphabeticallySmaller(String str1,String str2){
            if(str1.compareTo(str2) < 0){
                return true;
            }
            return false;
        }
    public static void main(String[] args) {
        String arr[] = {"sun","earth","mercury","mars"};
        String a[] = mergeSort(arr, 0, arr.length-1);

        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
}
