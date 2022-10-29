package HeapOrPriorityQueue.Practice;
import java.util.*;
public class MinOpsToHalveArraySum {
    static int minOps(ArrayList<Integer> nums){
        int sum = 0;
        for(int i=0;i<nums.size();i++){
            sum+=nums.get(i);
        }

        PriorityQueue<Integer>pq = new PriorityQueue<Integer>();
        for(int i =0;i<nums.size();i++){
            pq.add(-nums.get(i));
        }

        double temp = sum; 
        int count = 0;
        while(temp>sum/2){
            int x = -pq.peek();
            pq.remove();

            temp -= Math.ceil(x*1.0/2);
            pq.add(x/2);
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>(List.of(1,5,8,19));
        int count = minOps(nums);
        System.out.println(count);
    }
    
}
