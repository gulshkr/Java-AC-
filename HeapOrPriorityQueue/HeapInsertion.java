package HeapOrPriorityQueue;

import java.util.ArrayList;

public class HeapInsertion {
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){
            //add at last indddex
            arr.add(data);

            int x = arr.size()-1; //x is child index
            int par = (arr.size()-2)/2;

            while(arr.get(x)< arr.get(par)){  //O(logn)
                //swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,}
        
    }
    
}
