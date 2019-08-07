package com.ravi.datastructures.linkedList;

public class ReverseALinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.data = 0;
        LinkedList linkedList1 = new LinkedList();
        linkedList1.data = 2;
        linkedList.next = linkedList1;
        LinkedList linkedList2 = new LinkedList();
        linkedList2.data = 4;
        linkedList1.next = linkedList2;
        LinkedList linkedList3 = new LinkedList();
        linkedList3.data = 6;
        linkedList2.next = linkedList3;
        LinkedList linkedList4 = new ReverseALinkedList().reverseList(linkedList);
        while (linkedList4 != null) {
            System.out.println(linkedList4.data);
            linkedList4 = linkedList4.next;
        }
    }

    public LinkedList reverseList(LinkedList A) {
        LinkedList curr = new LinkedList();
        LinkedList prev = new LinkedList();
        if (A == null) {
            return curr;
        }

        curr = A.next;
        prev = A;
        prev.next = null;

        while (curr != null) {
            LinkedList next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
