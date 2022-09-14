package LinkedList;

public class RemoveLoopInLinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next; //move +1
            fast = fast.next.next;  //move +2
            if(slow==fast){
                return true;  //cycle exist
            }
        }
        return false;  //Cycle doesn't exist
    }

    public static void removeLoop(){
        //Detect cycle /loop
        boolean isCycle = false;
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next !=null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2
            if(slow==fast){
                isCycle = true;
                break;
            }
        }
        if(isCycle==false){
            return;
        }

        //find meeting point of the slow and fast
        slow = head;
        Node prev = null; //last node
        while(slow!=fast){
            prev=fast;
            slow = slow.next;  //+1
            fast = fast.next;  //+1
        }

        //remove cycle -> last.next = null
        prev.next = null;

    }

    public static void main(String[] args) {
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        //1->2->3->2
        System.out.println(isCycle());
        removeLoop();
        System.out.println(isCycle());
    
    }
    
}
