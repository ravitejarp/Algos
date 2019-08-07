package com.ravi.com.ravi.generalProblems;

public class ReverseUsingRecurssion {
    public static void main(String[] args) {
        System.out.println(ReverseUsingRecurssion.reverseTheString("RA V I "));
    }

    public static String reverseTheString(String input) {
        if (input.length() == 1 || input.length() == 0) {
            return input;
        }

        return reverseTheString(input.substring(1)) + input.charAt(0);
    }
}
