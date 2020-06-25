package graphs;

public class FoldableTree {
    static class Node{
        int val ;
        Node  left,right;
        Node(int d ){
            val= d;
            left = right=null;
        }
    }

    static class Tree{
        Node root;
        Tree(){
            root =null;
        }
       boolean isFoldable(Node node){
            if(node == null)
                return true;
            else
            mirror(node.left);
            boolean res = isSame(node.left,node.right);
            mirror(node.left);
            return res;
       }
       void mirror(Node node){
            if(node==null)
                return;
            else{
                Node temp;
                mirror(node.left);
                mirror(node.right);
                temp = node.left;
                node.left=node.right;
                node.right =temp;
            }
       }
       boolean isSame(Node l, Node r){
            if(l==null && r ==null)
                return  true;
            if(l!=null && r!=null && isSame(l.left, r.left) && isSame(l.right,r.right))
                return true;
            return false;
       }

       boolean isFoldableUtil(Node l ,Node r){
            if(l==null && r==null)
                return true;
             if(l==null || r==null)
                 return false;
             return isFoldableUtil(l.left,r.right) && isFoldableUtil(l.right,r.left);
       }
    }

    public static void main(String args[])
    {
        Tree tree = new Tree();

        /* The constructed binary tree is
             1
           /   \
          2     3
           \    /
            4  5
        */
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.right.left = new Node(4);
        tree.root.left.right = new Node(5);

        if (tree.isFoldable(tree.root))
            System.out.println("tree is foldable");
        else
            System.out.println("Tree is not foldable");
        if (tree.isFoldableUtil(tree.root.left, tree.root.right))
            System.out.println("tree is foldable");
        else
            System.out.println("Tree is not foldable");
    }
}
