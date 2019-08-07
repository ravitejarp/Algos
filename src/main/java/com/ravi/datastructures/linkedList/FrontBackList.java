package com.ravi.datastructures.linkedList;

public class FrontBackList {

    public void splitTheList(LinkedList linkedList) {
        LinkedList front = linkedList;
        LinkedList back = linkedList;
        if (linkedList == null) {
            front = null;
            back = null;
            return;
        }
        if (linkedList.next == null) {
            front = linkedList;
            back = null;
            return;
        }
        while (back.next != null && back.next.next != null) {
            front = front.next;
            back = back.next.next;
        }

        LinkedList next = front.next;
        front.next = null;
        back = next;
    }
}
