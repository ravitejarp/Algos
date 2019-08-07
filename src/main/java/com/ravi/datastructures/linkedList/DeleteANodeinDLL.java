package com.ravi.datastructures.linkedList;

public class DeleteANodeinDLL {

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.data = 10;
        doublyLinkedList.prev = null;

        DoublyLinkedList doublyLinkedList1 = new DoublyLinkedList();
        doublyLinkedList1.data = 11;
        doublyLinkedList1.prev = doublyLinkedList;
        doublyLinkedList.next = doublyLinkedList1;

        DoublyLinkedList doublyLinkedList2 = new DoublyLinkedList();
        doublyLinkedList2.data = 12;
        doublyLinkedList2.prev = doublyLinkedList1;
        doublyLinkedList1.next = doublyLinkedList2;

        DoublyLinkedList doublyLinkedList3 = new DoublyLinkedList();
        doublyLinkedList3.data = 13;
        doublyLinkedList3.prev = doublyLinkedList2;
        doublyLinkedList2.next = doublyLinkedList3;

        DoublyLinkedList doublyLinkedList4 = new DoublyLinkedList();
        doublyLinkedList4.data = 14;
        doublyLinkedList4.prev = doublyLinkedList3;
        doublyLinkedList3.next = doublyLinkedList4;

        DoublyLinkedList doublyLinkedList5 = new DoublyLinkedList();
        doublyLinkedList5.data = 15;
        doublyLinkedList5.prev = doublyLinkedList4;
        doublyLinkedList4.next = doublyLinkedList5;
        doublyLinkedList5.next = null;

        DoublyLinkedList doublyLinkedList6 = new DoublyLinkedList();
        doublyLinkedList6.data = 15;
        doublyLinkedList6.prev = null;
        doublyLinkedList6.next = null;

        new DeleteANodeinDLL().deleteANode(doublyLinkedList, 10);
        while (doublyLinkedList != null) {
            System.out.println(doublyLinkedList.data);
            doublyLinkedList = doublyLinkedList.next;
        }


    }

    public void deleteANode(DoublyLinkedList doublyLinkedList, int dataToDelete) {
        if (doublyLinkedList == null) {
            return;
        }
        if (doublyLinkedList.prev == null && doublyLinkedList.next == null) {
            doublyLinkedList = null;
            return;
        }
        while (doublyLinkedList != null) {
            if (doublyLinkedList.data == dataToDelete) {
                DoublyLinkedList prev = doublyLinkedList.prev;
                if (prev == null) {
                    doublyLinkedList.next.prev = null;
                    doublyLinkedList = doublyLinkedList.next;
                    continue;
                } else {
                    prev.next = doublyLinkedList.next;
                }
            }
            doublyLinkedList = doublyLinkedList.next;
        }
    }
}
