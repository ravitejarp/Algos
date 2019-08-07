package com.ravi.datastructures.linkedList;

public class MergeSortedList {

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

        LinkedList linkedList4 = new LinkedList();
        linkedList4.data = 1;
        LinkedList linkedList5 = new LinkedList();
        linkedList5.data = 2;
        linkedList4.next = linkedList5;
        LinkedList linkedList6 = new LinkedList();
        linkedList6.data = 3;
        linkedList5.next = linkedList6;
        LinkedList linkedList7 = new LinkedList();
        linkedList7.data = 5;
        linkedList6.next = linkedList7;

        MergeSortedList mergeSortedList = new MergeSortedList();
        LinkedList linkedList8 = mergeSortedList.mergerSortedLists(linkedList, linkedList4);
        while (linkedList8 != null) {
            System.out.println(linkedList8.data);
            linkedList8 = linkedList8.next;
        }

    }

    public LinkedList mergerSortedLists(LinkedList A, LinkedList B) {
        if (A == null && B == null) {
            return new LinkedList();
        }
        LinkedList C = new LinkedList();
        if (A == null) {
            C = B;
            return C;
        }
        if (B == null) {
            C = A;
            return C;
        }
        if (A.data < B.data) {
            C.data = A.data;
            A = A.next;
        } else {
            C.data = B.data;
            B = B.next;
        }
        C.next = null;
        LinkedList temp = C;
        while (A != null && B != null) {
            if (A.data < B.data) {
                temp.next = A;
                A = A.next;
            } else {
                temp.next = B;
                B = B.next;
            }
            temp = temp.next;
        }

        if (A != null) {
            temp.next = A;
        } else {
            temp.next = B;
        }


        return C;
    }
}
