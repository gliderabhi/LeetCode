package FirstSets;

import java.util.Scanner;

public class Nodes {
    static class Node {
        int data;
        int n0;
        Node left, right;
    }
    static Node newNode(int data, int no)
    {
        Node node = new Node();
        node.data = data;
        node.n0 = no;
        node.left = null;
        node.right = null;
        return (node);
    }
    static void printOddNodes(Node root, boolean isOdd)
    {
        if (root == null)
            return;

        if (isOdd == true)
            System.out.print(root.data + " ");

        printOddNodes(root.left, !isOdd);
        printOddNodes(root.right, !isOdd);
    }
    static void printEvenNode(Node root, boolean isEven)
    {
        if (root == null)
            return;

        if (isEven == true)
            System.out.print(root.data + " ");

        printOddNodes(root.left, !isEven);
        printOddNodes(root.right, !isEven);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int nodesNo = sc.nextInt();
            Node root = newNode(0,1);

            for(int t=0;t<nodesNo-1;t++){
                int a = sc.nextInt();
                int b = sc.nextInt();

            }
        }
    }
}
