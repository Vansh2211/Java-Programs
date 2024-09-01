import java.util.*;

public class ReverseDoublyLL {
    
    static Node head;
    class Node{
        int data;
        Node next;
        Node prev;

        Node(int d){
            this.data = d;
            next = prev = null;

        }
    }

    void ReverseDoublyLLreverse(){
         
        Node temp = null;
        Node current = head;

        while(head!=null){
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;

        }

        if(temp!=null){
            head = temp.prev;
        }
    }

    void push(int newData){
        Node newNode = new Node(newData);

        newNode.prev = null;

        newNode.next = head;

        if(head!=null){
            head.prev = newNode;
        }

        head = newNode;
    }

    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
 
      /**
     * @param args
     */
    public static void main(String[] args) {
        ReverseDoublyLL list = new ReverseDoublyLL();

        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        list.push(6);

        list.ReverseDoublyLLreverse();

        list.printList(head);

      }
}
