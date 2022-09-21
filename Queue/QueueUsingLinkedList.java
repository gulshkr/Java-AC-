package Queue;
//T.C - O(1)
public class QueueUsingLinkedList {
    //Create a class Node
    static class Node{
        int data;
        Node next;
        //NOw we will initialize our node
        Node(int data){
            this.data = data;
        }
    }
    static class Queue{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return head == null && tail==null;
        }

        //add
        public static void add(int data){
            Node newNode = new Node(data);
            if(head==null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        //remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int front = head.data;
            if(tail==head){
                tail=head = null;
            } else{
                head = head.next;
            }
            return front;
        }

        //peek - to searchh or see
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(2);
        q.add(3);
        q.add(4);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }

}
