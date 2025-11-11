import java.util.*;
//  * Definition for a binary tree node.
 class TreeNode {
       int val;
      TreeNode left;
      TreeNode right;
     TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

// do a level order traversal, remember in zigzag traversal alternate levels will already in right manner only you have 
// to do alternate levels
// 
class ZigZagOrderTraversalBST {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

         List<List<Integer>> zigzag = new ArrayList<>();
         if(root==null){
            return zigzag;
         }

         Queue<TreeNode> queue = new java.util.LinkedList<>();
         queue.add(root);
         boolean flag = false;

         while(!queue.isEmpty()){

            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            Stack<Integer> stack = new Stack<>();

            for(int i=0;i<size;i++){
                TreeNode node = queue.poll();

                if(flag){
                    stack.add(node.val);
                }
                else{
                    level.add(node.val);
                }


                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
            flag = !flag; // flip the flag at every alternate level

            while(!stack.isEmpty()){
                level.add(stack.pop());
            }

            zigzag.add(level);

         }

         return zigzag;

    }
}
