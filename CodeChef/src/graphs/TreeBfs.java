package graphs;

import java.util.LinkedList;
import java.util.Queue;

public class TreeBfs {
       static class  Node{
           int n;
           Node left , right;
           Node(int n){
               left =null;right=null;
               this.n=n;
           }

       }
       static  class BinaryTree{
           Node root;
           BinaryTree(){
               root = null;
           }


           public void printLevelOrder() {
               Queue<Node> que = new LinkedList<>();
               que.add(root);
               while(!que.isEmpty()){
                   Node n = que.poll();
                   System.out.print(n.n+ " ");
                   if(n.left!=null)
                   que.add(n.left);
                   if(n.right!=null)
                   que.add(n.right);
               }
           }
       }
    public static void main(String args[])
    {
        BinaryTree tree = new BinaryTree();
        tree.root= new Node(1);
        tree.root.left= new Node(2);
        tree.root.right= new Node(3);
        tree.root.left.left= new Node(4);
        tree.root.left.right= new Node(5);

        System.out.println("Level order traversal of binary tree is ");
        tree.printLevelOrder();
    }
}
