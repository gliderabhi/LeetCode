package StackQues;

public class StackMin {
    Node top= new Node(0);
    public static class Node {
        int n;
        Node next ;
        Node(int m){
            n=m;
            next =null;
        }

    }
    public static void  pop(StackMin list){
        Node temp= null;
        temp.next= list.top;

    }
    public static void main(String[] args) {

    }
}
