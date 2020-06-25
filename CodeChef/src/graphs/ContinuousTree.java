package graphs;

public class ContinuousTree {
    static class Node {
        int val;
        Node left, right;

        Node(int d) {
            val = d;
            left = null;
            right = null;
        }
    }
         static Node newNode(int d){
             Node dt = new Node(d);
             return dt;
         }

    private static boolean treeContinuous(Node node){
        if(node==null)return true;

        if(node.left==null && node.right==null)
            return  true;
        if(node.left==null)

            return (Math.abs(node.val - node.right.val)==1) && treeContinuous(node.right);
        if(node.right==null)
            return (Math.abs(node.val - node.left.val)==1) && treeContinuous(node.left);

        return (Math.abs(node.val-node.left.val)==1) &&
                (Math.abs(node.val-node.right.val)==1) &&
                treeContinuous(node.left) &&
                treeContinuous(node.right);
    }
    public static void main(String args[])
    {
        Node root = newNode(3);
        root.left     = newNode(2);
        root.right     = newNode(4);
        root.left.left = newNode(1);
        root.left.right = newNode(3);
        root.right.right = newNode(5);
        if(treeContinuous(root))
            System.out.println( "Yes") ;
        else
            System.out.println( "No");
    }

}
