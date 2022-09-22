package Queue;

import java.util.*;



public class DDeque {
    public static void main(String[] args) {
        Deque<Integer> q = new LinkedList<>();
        q.addFirst(1);
        q.addLast(2);
        q.addFirst(3);
        q.addFirst(4);
        System.out.println(q);
        q.removeLast();
        System.out.println(q);

    }
    
}
