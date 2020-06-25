package LinkedList;

import java.util.Scanner;

public class MergePointList {
    Node head; // head of list

    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    static class Node {

        int data;
        Node next;

        // Constructor
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    // Method to insert a new node
    public static MergePointList insert(MergePointList list, int data)
    {
        // Create a new node with given data
        Node new_node = new Node(data);
        new_node.next = null;

        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            list.head = new_node;
        }
        else {
            // Else traverse till the last node
            // and insert the new_node there
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            // Insert the new_node at last node
            last.next = new_node;
        }

        // Return the list by head
        return list;
    }
    public static Node mergePoint(Node l1, Node l2) {
        Node n = l1;
        int siz1 = 0, siz2 = 0;
        while (n != null) {
            n = n.next;
            siz1++;
        }
        n = l2;
        while (n != null) {
            n = n.next;
            siz2++;
        }
        int notCom;
        if (siz1 > siz2) {
            notCom = siz1 - siz2;
            n = l1;
            Node m = l2;
            for (int i = 0; i < notCom; i++) {
                n = n.next;
            }
            while (n != null) {
                if (m == n) {
                    return m;
                }
                n = n.next;
                m = m.next;
            }
        } else {
            notCom = siz2 - siz1;
            n = l1;
            Node m = l2;
            for (int i = 0; i < notCom; i++) {
                m = m.next;
            }
            while (n != null) {
                if (m == n) {
                    return m;
                }
                n = n.next;
                m = m.next;
            }

        }
        n= null;
        return n;
    }
    // Method to print the LinkedList.
    public static void printList(Node list)
    {
        Node currNode = list;

        System.out.print("LinkedList: ");

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");

            // Go to next node
            currNode = currNode.next;
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        /* Start with the empty list. */
        MergePointList list = new MergePointList();
        Scanner scanner =new Scanner(System.in);
        int n= scanner.nextInt();
        for(int i=0;i<n;i++){
            list = list.insert(list, scanner.nextInt());
        }
        MergePointList l2 = new MergePointList();
        int m = scanner.nextInt();
        for(int i=0;i<m;i++){
            l2 = l2.insert(l2, scanner.nextInt());
        }
        scanner.close();
       Node result= mergePoint(list.head,l2.head);
        // Print the LinkedList
        printList(result);
    }


}
