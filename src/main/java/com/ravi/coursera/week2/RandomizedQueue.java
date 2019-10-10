//import edu.princeton.cs.algs4.StdRandom;
//
//import java.util.Iterator;
//import java.util.NoSuchElementException;
//
//public class RandomizedQueue<Item> implements Iterable<Item> {
//
//    private Item[] items;
//    private int count;
//
//    // construct an empty randomized queue
//    public RandomizedQueue() {
//        items = (Item[]) new Object[2];
//        count = 0;
//    }
//
//    // is the randomized queue empty?
//    public boolean isEmpty() {
//        return count == 0;
//    }
//
//    // return the number of items on the randomized queue
//    public int size() {
//        return count;
//    }
//
//    // add the item
//    public void enqueue(Item item) {
//        if (item == null) {
//            throw new IllegalArgumentException("Null cant be inserted");
//        }
//        if (count == items.length) {
//            resize(2 * items.length);
//        }
//        items[count++] = item;
//
//    }
//
//    private void resize(int capacity) {
//        Item[] copy = (Item[]) new Object[capacity];
//        if (count >= 0) System.arraycopy(items, 0, copy, 0, count);
//        items = copy;
//    }
//
//    // remove and return a random item
//    public Item dequeue() {
//        if (count == 0) {
//            throw new NoSuchElementException("Queue is empty");
//        }
//        int rand = StdRandom.uniform(count);
//        Item value = items[rand];
//        if (rand != count - 1) {
//            items[rand] = items[count - 1];
//        }
//        items[count - 1] = null;
//        count--;
//        if (count > 0 && count <= items.length / 4) {
//            resize(items.length / 2);
//        }
//        return value;
//    }
//
//    // return a random item (but do not remove it)
//    public Item sample() {
//        if (count == 0) {
//            throw new NoSuchElementException("Queue is empty");
//        }
//        int rand = StdRandom.uniform(count);
//        Item value = items[rand];
//        if (count > 0 && count <= items.length / 4) {
//            resize(items.length / 2);
//        }
//        return value;
//    }
//
//    // return an independent iterator over items in random order
//    public Iterator<Item> iterator() {
//        return new Iterator<Item>() {
//            Item[] temp = items;
//            int tenpCount = count;
//            @Override
//            public boolean hasNext() { return tenpCount > 0;            }
//            @Override
//            public Item next() {
//                if (tenpCount == 0) {                    throw new NoSuchElementException("Queue is empty");                } else {
//                    int rand = StdRandom.uniform(tenpCount);
//                    Item value = temp[rand];
//                    if (rand != tenpCount - 1) {                        temp[rand] = temp[tenpCount - 1];                    }
//                    temp[tenpCount - 1] = null;
//                    tenpCount--;
//                    return value;
//                }
//            }
//        };
//    }
//
//    // unit testing (required)
//    public static void main(String[] args) {
//        RandomizedQueue<String> rand = new RandomizedQueue<>();
//        Iterator<String> iterator = rand.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//        rand.enqueue("ravi");
//        rand.enqueue("tea");
//        rand.enqueue("cofee");
//        rand.enqueue("dance");
//        rand.enqueue("ba");
//        rand.enqueue("by");
//        iterator = rand.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//    }
//
//}
