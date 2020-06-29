package SecondSets;

import java.util.PriorityQueue;

public class PriorityQue {
      public class TreeNode {
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
    static PriorityQueue<Integer> pq;
    public static void main(String[] args) {
        int[] arr = {3,1,4, Integer.parseInt(null),2};
        int k =1;
         pq= new PriorityQueue<>();
        TreeNode root ;

    }
    private static void addToQue(TreeNode root ){
          if(root ==null)
              return;
          pq.add(root.val);
          addToQue(root.left);
          addToQue(root.right);

    }
    private static int kthSmallest (TreeNode root, int k ){

          addToQue(root);
          for(int i=0;i<k-1;i++)
              pq.remove(pq.peek());


          return pq.peek();

    }
}
