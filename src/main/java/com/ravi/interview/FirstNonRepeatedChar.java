package com.ravi.interview;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        String val = "hhello";
        for (int i = 0; i < val.length(); i++) {
            if (val.lastIndexOf(val.charAt(i)) == i && val.indexOf(val.charAt(i)) == i) {
                System.out.println(val.charAt(i));
                break;
            }
        }
    }
}
