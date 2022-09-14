package JavaCollectionFramework;
import java.util.LinkedList;
public class Basic {
    public static void main(String[] args) {
        //Create - 
        LinkedList<Integer> ll = new LinkedList<>();

        //add 
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);

        //1->2->3
        System.out.println(ll);
        //remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
    
}
