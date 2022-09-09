package ArrayList;
import java.util.*;
public class Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(13);
        list.add(4);
        list.add(9);
        list.add(0);
        System.out.println(list);
        // This sort element in increasing order
        Collections.sort(list);  
        System.out.println(list);

        //this sort element in decreasing order
        Collections.sort(list,Collections.reverseOrder());  //Comparator fnx
        System.out.println(list);


    }
    
}
