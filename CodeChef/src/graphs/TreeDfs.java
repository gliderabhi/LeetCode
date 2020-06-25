package graphs;

import java.util.Stack;

public class TreeDfs {
    static class BinaryTree {
        TreeBfs.Node root;

        BinaryTree() {
            root = null;
        }

        private void printInorder(TreeBfs.Node root) {
            if (root == null)
                return;
            printInorder(root.left);
            System.out.print(root.n + " ");
            printInorder(root.right);
        }

        private void printPostOrder(TreeBfs.Node node) {
            if (node == null)
                return;
            printPostOrder(node.left);
            printPostOrder(node.right);
            System.out.print(node.n + " ");
        }
        private void printPreOrder(TreeBfs.Node node ){
            if(node==null)
                return ;
            System.out.print(node.n+ " ");
            printPreOrder(node.left);
            printPreOrder(node.right);
        }
        void printPostorder() {
            printPostOrder(root);
        }

        void printInorder() {
            printInorder(root);
        }

        void printPreorder() {
            printPreOrder(root);
        }

    }


    public static void main(String args[])
    {
        BinaryTree tree = new BinaryTree();
        tree.root= new TreeBfs.Node(1);
        tree.root.left= new TreeBfs.Node(2);
        tree.root.right= new TreeBfs.Node(3);
        tree.root.left.left= new TreeBfs.Node(4);
        tree.root.left.right= new TreeBfs.Node(5);

        System.out.println("Level order traversal of binary tree is ");
        tree.printInorder();
        System.out.println();
        tree.printPostorder();
        System.out.println();
        tree.printPreorder();
    }
}
