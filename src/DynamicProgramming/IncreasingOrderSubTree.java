package DynamicProgramming;

import java.util.ArrayList;
import java.util.Collections;

public class IncreasingOrderSubTree {
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
    ArrayList<Integer> l;
    public TreeNode increasingBST(TreeNode root) {
        l= new ArrayList<>();
        getList(root);
        Collections.sort(l);
        root = null;
        root = new TreeNode(l.get(0));
        for(int i =1;i<l.size();i++)
        {    root.right = new TreeNode(l.get(i));
             root = root.right;
        }
        return root;
    }

    private void getList(TreeNode root) {
         if(root == null)
             return;
         getList(root.left);
         l.add(root.val);
         getList(root.right);

    }
}
