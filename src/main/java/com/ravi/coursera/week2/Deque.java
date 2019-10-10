
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Deque<Item> implements Iterable<Item> {

    private Node head = null;
    private Node tail = null;
    private int size = 0;

    // construct an empty deque
    public Deque() {
        // This is an empty constructor
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
        return head == null;

    }

    // return the number of items on the deque
    public int size() {
        return size;
    }

    // add the item to the front
    public void addFirst(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("Null cant be added");
        }
        Node newNoe = new Node();
        newNoe.data = item;
        if (head == null) {
            head = newNoe;
            tail = newNoe;
        } else {
            newNoe.next = head;
            head.prev = newNoe;
            head = newNoe;
        }
        size++;
    }

    // add the item to the back
    public void addLast(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("Null cant be added to the list");
        }
        Node newNode = new Node();
        newNode.data = item;
        size++;
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

    }

    // remove and return the item from the front
    public Item removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("No more elements");
        }
        Item data = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        } else {
            head.prev = null;
        }
        size--;

        return data;
    }

    // remove and return the item from the back
    public Item removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("No more elements");
        }
        Item data = tail.data;
        tail = tail.prev;
        if (tail == null) {
            head = null;
        } else {
            tail.next = null;
        }
        size--;
        return data;
    }

    // return an iterator over items in order from front to back
    public Iterator<Item> iterator() {
        return new Iterator<Item>() {
            Node current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public Item next() {
                if (current == null) {
                    throw new NoSuchElementException("No more data to iterate");
                }
                Item data = current.data;
                current = current.next;
                return data;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("No Impl");
            }
        };
    }

    private class Node {
        Item data;
        Node prev;
        Node next;
    }

}