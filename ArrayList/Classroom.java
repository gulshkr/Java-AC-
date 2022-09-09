package ArrayList;

import java.util.ArrayList;

public class Classroom {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();

        //add operation - O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(1,9);
        System.out.println(list);

        //get operation - O(1)
        // int element = list.get(1);
        // System.out.println(element);

        //Delete operations - O(n)
        // list.remove(1);
        // System.out.println(list);

        //Set Operations - O(n)
        // list.set(1, 11);
        // System.out.println(list);

        //Contains operations - return true or false - O(n)
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));
    }
    
}
