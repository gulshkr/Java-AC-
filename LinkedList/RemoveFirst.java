package LinkedList;

public class RemoveFirst {
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

    //add Last function
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
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

    //add in the middle
    public void addmid(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }

        //i = idx-1; temp->prev
        newNode.next=temp.next;
        temp.next=newNode;
    }


    //Remove first element
    public int removeFirst(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public static void main(String[] args) {
        RemoveFirst ll = new RemoveFirst();
       
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addmid(2,7);
        ll.print();
        // System.out.println(ll.size);
        ll.removeFirst();
        ll.print();

    }
    
}
