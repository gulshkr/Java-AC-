package Queue.Practice;
import java.util.*;
//Connect N ropes with maximum cost - Given are n ropes of different lengths, the task is to Connect these ropes into one rope with minimum cost, such that the cost to connect two ropes is equal to the sum of their lengths. input - N = 4 , arr[4,3,2,6]  output - 29
public class ConnectNRopes {
    static int minCost(int arr[], int n){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i =0;i<n;i++){
            pq.add(arr[i]);
        }

        int result = 0;

        while(pq.size()>1){
            //poll in priority queue - it removes element
            int first = pq.poll();
            int second = pq.poll();
            result+=first+second;
            pq.add(first+second);

        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {4,3,2,6};
        int size = arr.length;
        System.out.println("Total cost for connecting "+" ropes is = "+minCost(arr, size));
    }
    
}
