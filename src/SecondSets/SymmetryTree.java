package SecondSets;

import java.util.ArrayList;
import java.util.List;

public class SymmetryTree {
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
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }

    public boolean isMirror(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;
        return (t1.val == t2.val)
                && isMirror(t1.right, t2.left)
                && isMirror(t1.left, t2.right);
    }
    ArrayList<Integer> a1;
    private  List<List<Integer>> levelOrder(TreeNode root) {
         a1 = new ArrayList<>();
         traberse(root);
         int val = 1;
         List<List<Integer>> res = new ArrayList<>();
         for(int i=0;i<a1.size();i= i+val){
             ArrayList<Integer> r1 = new ArrayList<>();
             for(int j =0;j<val;j++ ){
                 if(a1.get(i+j)!= Integer.MAX_VALUE)
                 r1.add(a1.get(i+j));
             }
             val*=2;
             res.add(r1);
         }

         return res;
    }
    private void traberse(TreeNode root ){
        if(root == null)
            a1.add(Integer.MAX_VALUE);

        if (root != null) {
            a1.add(root.val);

            traberse(root.left);
            traberse(root.right);
        }
    }
}
