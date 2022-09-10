//Monotonic - An Arraylist is monotonic if it is either monotone increasing or monotone decreasing.
//An Arraylist is monotone increasing if for all i<=j, nums.get(i)<=nums.get(j).AnArraylist nums is monotone decreasing if for all i <= j, nums.get(i) >= nums.get(j).
package ArrayList;
import java.util.*;
public class Monotonic {
    public static boolean isMonotone(ArrayList<Integer>list){
        boolean increasing = true;
        boolean decreasing = true;
        for(int i=0;i<list.size()-1;i++){
                if(list.get(i)>list.get(i+1)){
                    increasing = false;
                }
                if(list.get(i)<list.get(i+1)){
                    decreasing = false;
                }
        }
        return increasing|| decreasing;
    }
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        System.out.println(isMonotone(list));

    }
    
}
