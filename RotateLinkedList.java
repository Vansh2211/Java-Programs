

public class RotateLinkedList {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;

        }
    }

    void rotate(int k){

        if(k==0){
            return;
        }

        Node current = head;
        int count = 1;

        while(count<k || current!=null){
            current = current.next;
            count++;
        }

        if(current==null){
            return;
        }

        Node kthNode = current;

        while(current.next != null){
            current = current.next;
        }

        current.next = head;

        head = kthNode.next;
         
        kthNode.next = null;

        current.next = head;
    }

    void push(int newData){

        Node newnNode = new Node(newData);

        newnNode.next = head;
        head = newnNode;
    }

    void printList(){
        Node temp = head; 
        while (temp != null) { 
            System.out.print(temp.data + " "); 
            temp = temp.next; 
        } 
        System.out.println();
    }

    public static void main(String[] args) {
        RotateLinkedList list = new RotateLinkedList();

        for(int i=60;i>=10;i-=10){
            list.push(i);
        }
        

        list.rotate(4);

        list.printList();
        }
    
}
