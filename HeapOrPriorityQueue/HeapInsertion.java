package HeapOrPriorityQueue;

import java.util.ArrayList;

public class HeapInsertion {
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){
            //add at last index
            arr.add(data);

            int x = arr.size()-1; //x is child index
            int par = (arr.size()-2)/2;  //par is parent

            while(arr.get(x)< arr.get(par)){  //O(logn)
                //swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
            }
        }

        //peek
        public int peek(){
            return arr.get(0);
        }

        //Heapify
        private void heapify(int i){
            int left = 2*i+1;
            int right = 2*i+2;
            int minIdx = i;

            if(left < arr.size() && arr.get(minIdx) > arr.get(left)){
                minIdx = left;
            }

            if(right<arr.size() && arr.get(minIdx) > arr.get(right)){
                minIdx = right;
            }

            if(minIdx !=i){
                //swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
        }

        //Remove element
        public int remove(){
            int data = arr.get(0);

            //step - 1 - swap first & last
            int temp = arr.get(0);
            arr.set(0, arr.size()-1);
            arr.set(arr.size()-1, temp);

            //step - 2 - delete last
            arr.remove(arr.size()-1);

            //step  - 3 - heapify
            heapify(0);
            return data;
        }
    }
    public static void main(String[] args) {
        // int arr[] = {2,}
        
    }
    
}
