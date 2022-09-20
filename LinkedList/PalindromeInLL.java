package LinkedList;

import javax.xml.transform.Source;

public class PalindromeInLL {
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

    //Recursive Seaarch of element in linked list
    public int helper(Node head,int key){  //This is the main recursive search method
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head, key);
    }

    //Reverse Linked list
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    
    //find middle element in linked list
    //slow-fast approach 
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next; //+1
            fast = fast.next; //+2
        }
        return slow;//mid Node
    }

    //Check if it is palindrome
    public boolean checkPalindrome(){
        if(head==null || head.next == null){
            return true;
        }
    
        //Step -1 - find mid
        Node midNode = findMid(head);

        //Step - 2 - Reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; //right half head
        Node left = head;

        //Step-3 - Check left half & right half
        //check if it is equal
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public static void main(String[] args) {
        PalindromeInLL ll = new PalindromeInLL();
       
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);
        // System.out.println(ll);
        // ll.reverse();
        // ll.print();
        System.out.println(ll.checkPalindrome());
        
       

    }
    
}
