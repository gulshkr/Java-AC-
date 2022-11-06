package Hashing;
import java.util.*;
public class Linkedhashset {
    public static void main(String[] args) {
        //Hashset - unnordered list
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("noida");
        cities.add("Bengaluru");
        System.out.println(cities);

        //LinkedHashset - Ordered list
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbi");
        lhs.add("Noida");
        lhs.add("Bengaluru");
        System.out.println(lhs);
    }
    
}
