package LinkedList;

public class IterativeSearch {
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
        int i =0;
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

    //Remove last element
    public int removeLast(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if(size==0){
            int val = head.data;
            head = tail = null;
            size =0;
            return val;
        }

        //prev node - i =size-2
        Node prev = head;
        for(int i=0;i<size-2;i++){
            prev = prev.next;
        }
        int val = prev.next.data; //or tail.data
        prev.next =null;
        tail = prev;
        size--;
        return val;
    }
    //Iterative Search element in alinked list
    public int itrSearch(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
        if(temp.data==key){  //key found
            return i;
        }
        temp = temp.next;
        i++;
    }
    //key not found
    return -1;
    }
    public static void main(String[] args) {
        IterativeSearch ll = new IterativeSearch();
       
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addmid(2,7);
        ll.print();
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
        System.out.println("size of linked list are: "+ll.size);

        System.out.println("key at index: "+ll.itrSearch(3));
        System.out.println("key at index: "+ll.itrSearch(9));

    }
    
}
