package com.ravi.datastructures.linkedList;

public class AppendLinkedLists {

    public void appendList(LinkedList linkedListA, LinkedList linkedListB) {
        if (linkedListA == null && linkedListB == null) {
            return;
        }
        if (linkedListA == null) {
            linkedListA = linkedListB;
            return;
        }
        if (linkedListB == null) {
            return;
        }
        LinkedList tempList = linkedListA;
        while (tempList.next != null) {
            tempList = tempList.next;
        }
        tempList.next = linkedListB;
        linkedListB = null;
    }

}
