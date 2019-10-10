//package com.ravi.coursera;
//
//import edu.princeton.cs.algs4.StdRandom;
//
//import java.util.Iterator;
//import java.util.NoSuchElementException;
//
//public class RandomizedQueue<Item> implements Iterable<Item> {
//    private Item[] queue;
//    private int size = 0;
//
//    // construct an empty randomized queue
//    public RandomizedQueue() {
//        queue = (Item[]) new Object[2];
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
//    // is the randomized queue empty?
//    public boolean isEmpty() {
//        return size == 0;
//    }
//
//    // return the number of Ts on the randomized queue
//    public int size() {
//        return size;
//    }
//
//    // add the T
//    public void enqueue(Item item) {
//        if (item == null) {
//            throw new IllegalArgumentException("Null data");
//        }
//        if (size == queue.length) {
//            resize(2 * queue.length);
//        }
//        queue[size++] = item;
//    }
//
//    private void resize(int capacity) {
//        Item[] copy = (Item[]) new Object[capacity];
//        if (size >= 0) System.arraycopy(queue, 0, copy, 0, size);
//        queue = copy;
//    }
//
//    // remove and return a random Item
//    public Item dequeue() {
//        if (isEmpty()) {
//            throw new NoSuchElementException("No elements");
//        }
//        int random = StdRandom.uniform(size - 1);
//        Item val = queue[random - 1];
//        queue[random - 1] = null;
//        size--;
//        if (size > 0 && size <= queue.length / 4) {
//            resize(queue.length / 2);
//        }
//        return val;
//    }
//
//    // return a random Item (but do not remove it)
//    public Item sample() {
//        if (isEmpty()) {
//            throw new NoSuchElementException("No elements");
//        }
//        return queue[StdRandom.uniform(size - 1)];
//    }
//
//    // return an independent iterator over Items in random order
//    public Iterator<Item> iterator() {
//        return new Iterator<Item>() {
//            int sizeTemp = size;
//            Item[] tempQ = queue;
//
//            @Override
//            public boolean hasNext() {
//                return sizeTemp != 0;
//            }
//
//            @Override
//            public Item next() {
//                if (!hasNext()) {
//                    throw new NoSuchElementException("No more ele");
//                }
//                int nextInt = StdRandom.uniform(sizeTemp - 1);
//                Item val = tempQ[nextInt];
//                tempQ[nextInt] = null;
//                if (sizeTemp - nextInt + 1 >= 0) {
//                    System.arraycopy(queue, nextInt + 1, queue, nextInt + 1 - 1, sizeTemp - nextInt + 1);
//                }
//                sizeTemp--;
//                return val;
//            }
//
//            public void remove() {
//                throw new UnsupportedOperationException("This operation is not supported");
//            }
//        };
//    }
//
//}
