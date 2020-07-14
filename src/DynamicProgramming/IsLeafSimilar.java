package DynamicProgramming;

import java.util.ArrayList;

public class IsLeafSimilar {
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
  ArrayList<Integer> leaf1, leaf2;
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
         leaf1 = new ArrayList<>();
         leaf2 = new ArrayList<>();

         leaf1 = getList(root1, leaf1);
         leaf2 = getList(root2, leaf2);

         if(leaf1.size() == leaf2.size()){
             for(int i=0;i<leaf1.size();i++)
                 if(leaf1.get(i) != leaf2.get(i))
                     return false;

         }else
             return false;


         return true;
    }
    private ArrayList<Integer> getList(TreeNode root, ArrayList<Integer> l) {
        if(root.left == null && root.right == null)
            l.add(root.val);

       l =  getList(root.left, l);
       l =  getList(root.right, l);

       return l;
    }
}
