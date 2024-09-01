public class LinkedList{

    Node head;
    private int size;

    void addFirst1(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    void push(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    void push(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }



    public class Node{

        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;

        }

    }
    public void  addFirst(String string){

        Node newNode = new Node(string);
        newNode.next = head;
        head = newNode;


    }

    public void addLast(String data){

        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }

        Node lastNode = head;

        while(lastNode.next != null){
            lastNode = lastNode.next;

        }

        lastNode.next = newNode;
    }

    public void printList(Node head1) {
        Node currNode = head;
 
 
        while(currNode != null) {
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
    }

    public void removeFirst(){

        if(head == null){
            System.out.println("Empty list");
        }

        head = head.next;
        size--;
    }

    public void reverseIterative(){
        if(head == null || head.next==null){
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;

        while(head!=null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }
    



        public static void main(String[] args) {
            LinkedList list = new LinkedList();
            list.addFirst("good");
            list.addFirst("is");
            list.addFirst("Vansh");
            list.addLast("human being");
            list.printList(head);
            list.removeFirst();
            list.reverseIterative();


        }

        public void push(int i) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'push'");
        }

        public void reverse() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'reverse'");
        }

        public void printList(ReverseDoublyLL.Node head2) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'printList'");
        }
    }
   