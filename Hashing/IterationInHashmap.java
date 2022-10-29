package Hashing;
import java.util.*;
public class IterationInHashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Nepal", 6);
        hm.put("germany",15);

        //Iterate
        //hm.entrySet()
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("key="+k+ ",value="+hm.get(k));
        }
    }
    
}
