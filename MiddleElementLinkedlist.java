
import java.util.Vector;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class MiddleElementLinkedlist {
    
   

    static int getMiddle(Node head){

        Vector<Integer> list_values = new Vector<>();

        while(head != null){
            list_values.add(head.data);
            head = head.next;
        }

        int middle = list_values.size() /2;

        return list_values.get(middle);
        
    }



    public static void main(String[] args) {
        
        Node head = new Node(5);
        head.next = new Node(10);
        head.next.next = new Node(20);
        head.next.next.next = new Node(30);
        head.next.next.next.next = new Node(40);
        head.next.next.next.next.next = new Node(50);

        System.out.println(getMiddle(head));


    }
}
