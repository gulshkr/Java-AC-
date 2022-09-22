package Queue;
import java.util.*;
//Stack using deque
public class StackUsingDeque {
    static class Stack{
        Deque<Integer> deque = new LinkedList<>();

        //Push
        public void push(int data){
            deque.addLast(data);
        }
        //pop
        public int  pop(){
            return deque.removeLast();
        }

        //peek or search
        public int peek(){
            return deque.getLast();
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("peek = "+s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
    
}
