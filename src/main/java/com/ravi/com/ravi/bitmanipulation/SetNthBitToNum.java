package com.ravi.com.ravi.bitmanipulation;

public class SetNthBitToNum {
    public static void main(String[] args) {
        int i = new SetNthBitToNum().setNthBit(10, 1);
        System.out.println(i);
    }

    public int setNthBit(int num, int n) {
        int checkBit = 1 << n;
        return num | checkBit;
    }

    public int setNthBitTo0(int num, int n) {
        int checkBit = 1 << n;
        int setBit = ~checkBit;
        return setBit & num;
    }
}
