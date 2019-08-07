package com.ravi.leetcode;

public class LastWorldLength {
    public static void main(String[] args) {
        LastWorldLength lastWorldLength = new LastWorldLength();
        lastWorldLength.lengthOfLastWord("a ");
    }

    public int lengthOfLastWord(String s) {
        if (s.lastIndexOf(' ') < 0) {
            return s.length();
        }
        int index = s.lastIndexOf(' ');
        return s.length() - index - 1;
    }
}
