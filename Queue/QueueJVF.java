package Queue;
import java.util.*;

public class QueueJVF { //jjava virtual function
    public static void main(String[] args) {
        // Queue<Integer> q = new LinkedList<>(); //ArrayDeque - we can implement queue using linked list or array dequeue
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        
    }
    
}
