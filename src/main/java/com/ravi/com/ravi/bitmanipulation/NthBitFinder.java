package com.ravi.com.ravi.bitmanipulation;

public class NthBitFinder {
    public int findNthBit(int num, int n) {
        int finder = 1 << n;
        int nthBit = num & finder;

        if (nthBit == finder) {
            return 1;
        }

        return 0;
    }
}
