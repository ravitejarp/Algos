package com.ravi.datastructures.linkedList;

public class LinkedListImpl {
    public void insertAtNthPosition(LinkedList linkedList, int pos, int data) {
        if (pos <= 0) {
            return;
        }
        if (pos == 0 || linkedList == null) {
            LinkedList linkedList1 = new LinkedList();
            linkedList1.data = data;
            linkedList1.next = null;
            linkedList = linkedList1;
            return;
        }

        int index = 0;
        while (linkedList.next != null) {
            if (index == pos) {
                LinkedList next = linkedList.next;
                LinkedList newList = new LinkedList();
                newList.data = data;
                newList.next = next;
                return;
            }
            linkedList = linkedList.next;
            index++;
        }
    }

    public void deleteAll(LinkedList linkedList) {
        if (linkedList == null) {
            return;
        }
        while (linkedList != null) {
            linkedList = linkedList.next;
        }
    }

    public void insert_sortedList(LinkedList linkedList, int data) {
        if (linkedList == null) {
            linkedList = new LinkedList();
            linkedList.data = data;
            linkedList.next = null;
            return;
        }
        LinkedList prev = linkedList;
        while (linkedList.next != null) {
            if (linkedList.data > data) {
                LinkedList linkedList1 = new LinkedList();
                linkedList1.data = data;
                linkedList1.next = prev.next;
                linkedList.next = linkedList1;
                return;
            } else {
                prev = linkedList;
                linkedList = linkedList.next;
            }
        }
    }
}
