package com.ravi.interview;

public class Beautiful {

    static int beautifulBinaryString(String b) {
        int count = 0;
        for (int i = 0; i < b.length(); i++) {
            System.out.println(i);
            i += b.indexOf("010", i - 1) + 2;
            count++;
            System.out.println(i);
        }

        return count;

    }

    public static void main(String[] args) {
        System.out.println(beautifulBinaryString("0100101010"));
    }
}
