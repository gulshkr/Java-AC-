package LinkedList;

public class LinkedList {
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

    public void addFirst(int data){
        //Step1 - create a new node
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
            return;
        }

        //Step2 - newNode next = head
        newNode.next = head;  //Link step

        //Step3 - head = newNode
        head = newNode;
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
    }
    
}
