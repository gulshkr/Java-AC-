package Hashing;
import java.util.*;
public class IterationInHashset {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("noida");
        cities.add("Bengaluru");

        //using iterators
        // Iterator it = cities.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        //using advance for loop
        for(String city: cities){
            System.out.println(city);
        }
    }
    
}
