package SecondSets;

import com.sun.source.tree.Tree;

public class BST {

    private static TreeNode root;

    static class TreeNode{
        int val ;
        TreeNode left, right ;

        public TreeNode(int val) {
            this.val = val;
        }


    }

    private static TreeNode  insert(TreeNode root, int val){
        if(root == null){
            root = new TreeNode(val);
            return root;
        }
        if(root.val < val)
            root.right =  insert(root.right,val);
        if(root.val > val)
            root.left=  insert(root.left, val);

        return root;
    }
    private static TreeNode delete(TreeNode root, int val){
        if(root == null)
             return  root;

        if(root.val < val)
           root.right = delete(root.right, val);
        else if(root.val > val)
          root.left =  delete(root.left, val);

        else{
            if(root.left == null)
                return  root.right;
            else if(root.right == null)
                return root.left;

        }

        return root;
    }
    private static void print(TreeNode root ){
        if(root == null)
            return;
        
        System.out.println(root.val);
        print(root.left);
        print(root.right);
    }

    public static void main(String[] args) {
        root = new TreeNode(10);
        insert(root, 14);
        insert(root, 19);
        insert(root, 24);
        insert(root, 9);
        insert(root, 4);

        delete(root,9);
        print(root);


    }
    
}
