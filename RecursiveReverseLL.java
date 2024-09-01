class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    
}

public class RecursiveReverseLL {
    
    static Node reverseRecursive(Node head){

        if(head == null || head.next == null){
            return head;
        }

        Node rest = reverseRecursive(head.next);

        head.next.next = head;

        head.next = null;

        return rest;
    }

    static void printList(Node node){
        while(node!=null){
            System.out.print("-->" + node.data);
            node = node.next;
        }
    }

    public static void main(String[] args) {
        
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        head = reverseRecursive(head);

        printList(head);


    }
}
