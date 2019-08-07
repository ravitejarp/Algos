package com.ravi.datastructures.linkedList;

public class RemoveDuplicates {
    public void removeDuplicates(LinkedList linkedList) {
        if (linkedList == null || linkedList.next == null) {
            return;
        }
        while (linkedList.next != null) {
            if (linkedList.data == linkedList.next.data) {
                linkedList.next = linkedList.next.next;
                continue;
            }
            linkedList = linkedList.next;

        }
    }
}
