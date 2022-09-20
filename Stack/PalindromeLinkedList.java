package Stack;
import java.util.*;
//Practice question - 1 - Palindrome linked list - We have singly linked list characters, write a function that returns true if the given list is a palindorme , else false ex - A->B->C->B->A
public class PalindromeLinkedList {
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

    //find Middle
    public Node findMid(Node head){

        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            
        }
        return slow;
    }

    public  boolean isPalindrome(){
        if(head==null || head.next==null){
            return true;
        }
        //find mid
        Node midNode = findMid(head);

        //reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        //check left half and right half if it is equal
        while(right!=null){
            if(right.data!=left.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;

    }

    public static void main(String[] args) {
        PalindromeLinkedList ll = new PalindromeLinkedList();
        ll.addLast('A');
        ll.addLast('B');
        ll.addLast('C');
        ll.addLast('B');
        ll.addLast('A');
        ll.addLast('D');
        // System.out.println(ll);
        System.out.println(ll.isPalindrome());

        
    }
    
}
