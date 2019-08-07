package com.ravi.coursera;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Deque<Item> implements Iterable<Item> {

    private int size = 0;
    private Node first = null;
    private Node last = null;

    // construct an empty deque
    public Deque() {
        // Empty constructor
    }

    // unit testing (required)
    public static void main(String[] args) {
        Deque<String> deque = new Deque<>();
        deque.addFirst("Test1");
        Iterator<String> iterator = deque.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        deque.addLast("Test2");
        Iterator<String> iterator1 = deque.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
        deque.removeFirst();
        Iterator<String> iterator2 = deque.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
            iterator2.remove();
        }
        deque.removeLast();
        Iterator<String> iterator3 = deque.iterator();
        while (iterator3.hasNext()) {
            System.out.println(iterator3.next());
            iterator3.remove();
        }
    }

    // is the deque empty?
    public boolean isEmpty() {
        return first == null;

    }

    // return the number of items on the deque
    public int size() {
        return size;
    }

    // add the item to the front
    public void addFirst(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("Null data");
        }
        first = new Node(item, first, null);
        size++;
        if (last == null) {
            last = first;
        } else if (last.prev == null) {
            last.prev = first;
            first.next = last;
        }
    }

    // add the item to the back
    public void addLast(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("Null data");
        }

        last = new Node(item, null, last);
        if (first == null) {
            first = last;
        } else if (first.next == null) {
            first.next = last;
            last.prev = first;
        }
        size++;
    }

    // remove and return the item from the front
    public Item removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        Node next = first;
        first = first.next;
        if (first != null) {
            first.prev = null;
        } else {
            last = null;
            first = null;
        }
        size--;
        return next.data;
    }

    // remove and return the item from the back
    public Item removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        Node next = last;
        last = last.prev;
        if (last != null) {
            last.next = null;
        } else {
            first = null;
            last = null;
        }
        size--;
        return next.data;
    }

    // return an iterator over items in order from front to back
    public Iterator<Item> iterator() {
        return new Iterator<Item>() {
            Node current = first;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public Item next() {
                if (current == null) {
                    throw new NoSuchElementException("No data");
                }
                Node temp = current;
                current = current.next;
                return temp.data;
            }

            public void remove() {
                throw new UnsupportedOperationException("This operation is not supported");
            }
        };
    }

    private class Node {
        private final Item data;
        private Node next;
        private Node prev;

        Node(Item data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

    }

}
