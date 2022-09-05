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

    //2. using merge approach T.C - O(nlogn)
    public static int merge(int arr[],int si,int mid,int ei){
        int i = si,j = mid,k =0;
        int invCount = 0;
        int temp[] = new int[(ei-si+1)];

        //when both condition are true then
        while((i<mid) && (j<=ei)){
            if(arr[i]<=arr[j]){
                temp[k] = arr[i];
                k++;
                i++;
            } else{
                temp[k] = arr[j];
                invCount+=(mid-i);
                k++;
                j++;
            }
        }

        //if both condition are not true then this
        while(i<mid){
            temp[k]=arr[i];
            k++;
            i++;
        }
        while(j<=ei){
            temp[k]= arr[j];
            k++;
            j++;
        }
        for(i=si,k=0;i<=ei;i++,k++){
            arr[i] = temp[k];
        }
        return invCount;
    }
    private static int mergeSort(int arr[],int si,int ei){
        int invCount = 0;
        if(si<ei){
            int mid = (si+ei)/2;

            invCount += mergeSort(arr, si, mid);
            invCount += mergeSort(arr, mid+1, ei);
            invCount += merge(arr, si, mid+1, ei);
        }
        return invCount;
    }

    // public static int getInversionCount(int arr[]){
    //     int n = arr.length;
    //     return mergeSort(arr, 0, n-1);
    // }
    public static void main(String[] args) {
        int arr[] ={1,20,6,4,5};
        int n = arr.length;
        // System.out.println("Inversion count = "  +getInversionCount(arr));
        System.out.println(mergeSort(arr, 0, n-1));
    }
    
}
