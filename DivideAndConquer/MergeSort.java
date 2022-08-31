package DivideAndConquer;

public class MergeSort {
    public static void printArray(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    //T.C - O(nlogn)  S.C - O(n) - time complexity is good but space complexity is not good
    //merge sort
    public static void mergeSort(int arr[],int si,int ei){
        //Base case
        if(si>=ei){
            return;
        }

        //Kaam
        int mid = si+(ei-si)/2;
        mergeSort(arr, si, mid); //for right part
        mergeSort(arr, mid+1, ei);  //for left part
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[],int si,int mid,int ei){
        int temp[] = new int[ei-si+1];
        int i = si; //iterator for left part
        int j = mid+1; //iterator for right part
        int k = 0; //iterator for temp arr

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
              temp[k] = arr[i];
              i++;
            } else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        //left part
        while(i<=mid){
            temp[k++]=arr[i++];
        }

        //right part
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        
        //copy temp to original arr
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        int n = arr.length;
        mergeSort(arr, 0, arr.length-1);
        printArray(arr);

    }
    
}
