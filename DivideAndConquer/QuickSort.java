package DivideAndConquer;

public class QuickSort {
    public static void printArray(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[],int si,int ei){
        //Base case
        if(si>=ei){
            return;
        }

        //last element
        int pIdx = partition(arr, si, ei);  //pIdx = pivot index
        quickSort(arr, si, pIdx-1);  //left 
        quickSort(arr, pIdx+1, ei);  //right
    }

    public static int partition(int arr[],int si,int ei){
        int pivot = arr[ei];
        int i = si-1;  //to make place for the elements smaller than pivot

        for(int j=si;j<ei;j++){
            if(arr[j]<pivot){
                i++;  //jagah banayega ye
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        //abhi hume pivot ko sahi jagah pe lana hai means ki matlab ki pehle 3 2 | 5 | 9 8 6(5 pivot hai humara)
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,8,2,5};
        quickSort(arr, 0, arr.length-1);
        printArray(arr);
    }
    
}
