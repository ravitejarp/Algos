package com.ravi.datastructures.linkedList;

public class MoveNodeFromLists {
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

        MoveNodeFromLists moveNodeFromLists = new MoveNodeFromLists();
        moveNodeFromLists.moveListsFromNode(linkedList, null);


    }

    public void moveListsFromNode(LinkedList A, LinkedList B) {
        if (A == null || B == null) {
            while (A != null) {
                System.out.println(A.data);
                A = A.next;
            }
            while (B != null) {
                System.out.println(B.data);
                B = B.next;
            }
            return;
        }
        LinkedList next = A.next;
        A.next = B;
        B = A;
        A = next;
        while (A != null) {
            System.out.println(A.data);
            A = A.next;
        }
        while (B != null) {
            System.out.println(B.data);
            B = B.next;
        }
    }
}
