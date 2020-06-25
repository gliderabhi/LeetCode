package LinkedList;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplicates {

    static class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int nodeval) {
            this.val = nodeval;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public ListNode head;
        public ListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeval) {
            ListNode node = new ListNode(nodeval);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    //done
    static ListNode removeDuplicates(ListNode A) {
        ListNode head = A;
        while (head != null && head.next != null) {
            if (head.val == head.next.val) {
                ListNode temp = head.next;
                head.next = temp.next;
                continue;
            } else
                head = head.next;
        }
        return A;
        /*
        int val = head1.val;
        ListNode head = head1;
        ListNode temp = head1;
        head1= head1.next;
        while(head1!= null){
            if(head1.val == val){
                temp = head1.next;
                head1.next = temp.next;
            }
            val = head1.val;
            head1 = head1.next;
        }
        return head;*/
    }

    //done
    static ListNode mergeLists(ListNode A, ListNode B) {
        ListNode C = new ListNode(0);
        ListNode head = C;
        while (A != null && B != null) {
            if (A.val < B.val) {
                C.next = A;
                A = A.next;
                C = C.next;
            } else if (B.val <= A.val) {
                C.next = B;
                B = B.next;
                C = C.next;
            }
        }
        if (A != null) {
            C.next = A;
        } else if (B != null) {
            C.next = B;
        }
        return head.next;

    }
    //done
    static ListNode swapAdjacentTwo(ListNode a){
        if(a==null || a.next==null)return a;
        ListNode ans=a;
        while(a!=null && a.next!=null)
        {
            int x=a.val;
            a.val=a.next.val;
            a.next.val=x;
            a=a.next.next;
        }
        return ans;

    }


    //submitted right
    static ListNode numsAdd(ListNode A, ListNode B){
        int carry =0;
        ListNode temp = new ListNode(0);
        ListNode c = temp;
        while(A!= null || B!=null){
            int a =0;
            if(A!=null){
                a= A.val;
                A= A.next;
            }
            int b= 0;
            if(B!=null){
                b= B.val;
                B= B.next;
            }
            int sum = a+b+carry;
            carry = sum /10;
            int res = sum%10;
            ListNode r = new ListNode(res);
            temp.next = r;
            temp = r;
        }
        if(carry!=0){
            ListNode r = new ListNode(carry);
            temp.next =r;
            temp = r;
        }
        return c.next;
    }


    //not done
    static ListNode insertionSort(ListNode A){
        ListNode i = A;
        ListNode j = A;
        int noSwap=0;
        int size =0;
        while(i!= null){
            size++;
            i= i.next;
        }
        while (noSwap <= size){
            j=A;
            noSwap =0;
            while(j!=null && j.next!=null){
                if(j.val < j.next.val){
                    j = j.next;
                    noSwap++;
                }else{
                    int temp = j.val;
                    j.val = j.next.val;
                    j.next.val = temp;
                    j= j.next.next;
                }
            }

        }

        return A;
    }

    //completed
    static ListNode removeNth(ListNode A, int B) {
        ListNode thead=A;
        int s=0;
        while(thead!= null){
            thead = thead.next;
            s++;
        }
        thead =A;
        if(B<=0)
            return null;
        else if(B>s)
        {
            A=A.next;
            return A;
        }
        else if(B==s)
        {
            A=A.next;
            return A;
        }
        else
        {
            int p=(s-B-1);
            for(int i=0;i<p;i++)
            {
                A=A.next;
            }
            A.next=A.next.next;
            return thead;
        }
    }

    public static void printSinglyLinkedList(ListNode node, String sep) throws IOException {
        while (node != null) {
            System.out.print(String.valueOf(node.val));

            node = node.next;

            if (node != null) {
                System.out.print(sep);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

            SinglyLinkedList llist1 = new SinglyLinkedList();

            int llist1Count = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < llist1Count; i++) {
                int llist1Item = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                llist1.insertNode(llist1Item);
            }

            SinglyLinkedList llist2 = new SinglyLinkedList();

            int llist2Count = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < llist2Count; i++) {
                int llist2Item = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                llist2.insertNode(llist2Item);
            }

           // ListNode llist3 = mergeLists(llist1.head, llist2.head);
           // ListNode res = mergeLists(llist1.head,llist2.head);
            // ListNode res= removeNth(llist1.head, scanner.nextInt());
            /*ListNode res= insertionSort(llist1.head);
            printSinglyLinkedList(res, " ");
*/
           printSinglyLinkedList(numsAdd(llist1.head,llist2.head)," ");
        scanner.close();
    }

    static ListNode  add(ListNode  C , int key){
        ListNode  temp = new ListNode(key);
        temp.next = C;
        C = temp;
        return C;
    }
    static ListNode reverseList2(ListNode A, int b, int c) {

        if(b == c ) return A;
        ListNode temp1 = null, temp2 = null,arr = null,arrend = null ;
        int i =0;
        int t =0;
        ListNode B = A;
        while(B != null){
            i++;
            if(i == c){
                arr = add(arr,B.val);
                t = 0;
                temp2 = B;
                break;
            }
            if(i == b - 1 ) temp1 = B;
            if(i == b || t == 1){

                t = 1;
                arr = add(arr,B.val);

            }
            if(i == c){

            }

            B = B. next;

        }
        arrend = arr;
        while(arrend.next != null){
            arrend = arrend. next;
        }
        arrend.next = temp2.next;
        if(temp1 == null) {
            temp1 = arr;
            return temp1;
        }
        else temp1. next = arr;


        return A;
    }
}
