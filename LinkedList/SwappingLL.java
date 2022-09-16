package LinkedList;

public class SwappingLL {
    public static class Node{
        int data;
        Node next;

        public Node(int d){
            data = d;
            next = null;
        }
    }
    Node head;
    public void swapNodes(int x,int y){
        if(x==y){
            return;
        }
        Node prevX = null,currX = head;
        while(currX!=null && currX.data!=x){
            prevX = currX;
            currX = currX.next;
        }
        Node prevY = null,currY = head;
        while(currY!=null && currY.data!=y){
            prevY = currY;
            currY = currY.next;
        }
        if(currX==null || currY == null){
            return;
        }

        if(prevX!=null){
            prevX.next = currY;
        } else{
            head = currY;
        }
        if(prevY!=null){
            prevY.next = currX;
        } else{
            head = currX;
        }
        //swap
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }

    //push element as input
    public void push(int new_data){
        Node new_Node = new Node(new_data);
        new_Node.next = head;
        head = new_Node;
    }
    //print
    public void printList(){
        Node tNode = head;  //temp node
        while(tNode!=null){
            System.out.print(tNode.data+"->");
            tNode = tNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SwappingLL list = new SwappingLL();

        list.push(7);
        list.push(6);
        list.push(5);
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);

        System.out.println("Original linked list: ");
        list.printList();

        System.out.println("Linked list after swapp : ");
        list.swapNodes(2, 6);
        list.printList();
    }
    
}
