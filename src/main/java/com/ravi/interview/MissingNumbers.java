package com.ravi.interview;

import java.util.BitSet;

public class MissingNumbers {
    public static void main(String[] args) {
        missingNumbers(new int[]{1, 2, 3, 5, 6}, 6);
        missingNumbers(new int[]{1, 2, 3, 3, 6}, 6);
    }

    static void missingNumbers(int[] input, int count) {
        BitSet bitSet = new BitSet(count);

        for (int i : input) {
            bitSet.set(i - 1);
        }

        int firstIndexx = bitSet.nextClearBit(0);
        while (firstIndexx < count) {
            System.out.println(firstIndexx + 1);
            firstIndexx = bitSet.nextClearBit(firstIndexx + 1);
        }
        System.out.println("===================");
    }
}
