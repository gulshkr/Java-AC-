package LinkedList;

public class ZigZag {
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

    //Add first function
    public void addFirst(int data){
        //Step1 - create a new node
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
            return;
        }

        //Step2 - newNode next = head
        newNode.next = head;  //Link step

        //Step3 - head = newNode
        head = newNode;
    }

    //Print method -- T.C - O(n)
    public void print(){
        if(head == null){
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ->");
            temp= temp.next;
        }
        System.out.println("null");
    }

    public void zigZag(){
        //find mid
        Node slow = head;
        Node fast = head.next;
        while(fast !=null && fast.next != null){
            slow = slow.next;  // +1
            fast = fast.next.next;  //+2
        }
        Node mid =slow;

        //reverse 2nd half 
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextL, nextR;
        //alt merge - zig-zag merge
        while(left !=null && right !=null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }

        
    }
    
    public static void main(String[] args) {
        ZigZag ll = new ZigZag();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        ll.zigZag();
        ll.print();
    }
}
