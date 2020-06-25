package LinkedList;
import java.util.Scanner;

public class ReverseLink {
    static class LinkNode {
        Node head;

        static class Node {
            int v;
            Node next;

            Node(int n) {
                v = n;
                next = null;
            }
        }
        public static LinkNode reverse(LinkNode linkNode){
             Node prev, curr,next;
             prev = null;
             curr=linkNode.head;
             next= null;
             while (curr!=null){
                 next= curr.next;
                 curr.next= prev;
                 prev = curr;
                 curr = next;
             }
             linkNode.head = prev;
            return linkNode;
        }
        static LinkNode insrt(LinkNode list, int data) {
            Node r = new Node(data);
            r.next = null;
            if(list.head==null){
                list.head = r;
            }else{
                Node last = list.head;
                while (last.next != null) {
                    last = last.next;
                }

                // Insert the new_node at last node
                last.next = r;
            }

            // Return the list by head
            return list;
        }
        public static void print(LinkNode l ){
            Node h = l.head;
            while(h != null){
                System.out.print(h.v+ " ");
                h = h.next;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        LinkNode link = new LinkNode();
        for(int i=0;i<n;i++){
            link =link.insrt(link,scanner.nextInt());
        }
        link = link.reverse(link);
        link.print(link);
    }
}
