package com.ravi.com.ravi.generalProblems;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(new Palindrome().isPalindrome("abcd"));
        System.out.println(new Palindrome().isPalindrome("cac"));
        System.out.println(new Palindrome().isPalindrome("caac"));
        System.out.println(new Palindrome().isPalindrome("madam"));
        System.out.println(new Palindrome().isPalindrome("lonely tylenol"));
        System.out.println(new Palindrome().isPalindrome(null));
    }

    public boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }
        input = input.replaceAll(" ", "").toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            if (i > input.length() - i - 1) {
                break;
            }
            if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }
}
