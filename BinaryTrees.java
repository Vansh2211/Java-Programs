import java.util.*;

public class BinaryTrees {
    

        private static class Node{
            int value;
            Node left;
            Node right;

            public Node(int value){
                this.value = value;
            }
        }
        
        private static Node root;

        public BinaryTrees(){
            root = null;
        }

        public void populate(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the root node");
            int value = scanner.nextInt();
            root  = new Node(value);
            populate(scanner,root);
            
        }

        private void populate(Scanner scanner,Node node){

            System.out.println("do you want to enter left node of" + node.value);
            boolean left = scanner.nextBoolean();
            if(left){
                System.out.println("enter left node of " + node.value);
                int value = scanner.nextInt();
                node.left = new Node(value);
                populate(scanner,node.left);
            }
            
            System.out.println("do you want to enter right node of " + node.value);
            boolean right = scanner.nextBoolean();
            if(right){
                System.out.println("enter right node of " + node.value);
                int value = scanner.nextInt();
                node.right = new Node(value);
                populate(scanner,node.right);
            }
        }

        public void display() {
            display(this.root,"");
        }

        private void display(Node node,String indent){
            if(node==null){
                return;
            }
            System.out.println(indent + node.value);
            display(node.left,indent + "\t");
            display(node.right, indent + "\t");
        }

        public void prettyDisplay(){
            prettyDisplay(root , 0);
        }

        private void prettyDisplay(Node node,int level){
            if(node == null){
                return;
            }

            prettyDisplay(node.right,level+!);
            
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            BinaryTrees tree = new BinaryTrees();
            tree.populate();
            tree.display();

        }



}
