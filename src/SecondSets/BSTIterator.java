package SecondSets;

import java.util.PriorityQueue;

public class BSTIterator {
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

  class BST_Iterator {
        PriorityQueue<Integer> pq;
        public BST_Iterator(TreeNode root) {
            pq = new PriorityQueue<>();
            add(root);
        }
        private void add(TreeNode node ){
            if(node == null)
                return;

            pq.add(node.val);

            add(node.left);
            add(node.right);
        }
        public int next() {
            return pq.poll();
        }
        public boolean hasNext() {
            if(pq.size() >0)
                return true;
            else return false;
        }
    }
}
