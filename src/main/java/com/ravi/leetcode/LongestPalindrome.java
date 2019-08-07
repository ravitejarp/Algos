package com.ravi.leetcode;

public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(LongestPalindrome.longestPali("babadada"));
    }

    public static String longestPali(String input) {
        int index = 0;
        int lastIndex = 0;
        int length = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int nextIndex = input.indexOf(c, i + 1);
            for (int j = i, k = nextIndex; k >= 0; j++, k--) {
                if (input.charAt(j) != input.charAt(k) || length > nextIndex - i) {
                    j = i;
                    k = nextIndex = input.indexOf(c, nextIndex + 1);
                    if (j + 1 == k) {
                        index = i;
                        lastIndex = nextIndex;
                        length = nextIndex - i;
                    }
                } else if (j + 1 >= k) {
                    index = i;
                    lastIndex = nextIndex;
                    length = nextIndex - i;
                    j = i;
                    k = nextIndex = input.indexOf(c, nextIndex + 1);
                    if (k < 0) {
                        break;
                    }
                }

            }
        }

        return length == 0 ? "" : input.substring(index, lastIndex + 1);
    }

}
