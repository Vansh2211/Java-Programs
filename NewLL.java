

public class NewLL {

    NewLL.Node head;
    public class Node{

        NewLL.Node next;
        int data;

        public Node(int data) {
            this.next = (NewLL.Node) null;
            this.data = data;

        }

        public void addFirst1(int data){

            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        public void addLast(int data){
            Node newNode = new Node(data);
            if(head==null){
                head = newNode;
                return;
            }

            NewLL.Node lastNode = head;
            while(lastNode.next == null){
                lastNode = lastNode.next;
            }

            lastNode = lastNode.next;
        }
     
    }

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.addFirst1(1);
    }
}
