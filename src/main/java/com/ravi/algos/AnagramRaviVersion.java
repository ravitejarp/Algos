package com.ravi.algos;

import java.util.ArrayList;
import java.util.List;

public class AnagramRaviVersion {
    public static void main(String[] args) {
        List<String> abcd = AnagramRaviVersion.getAnagrams("ABCD");
        for (String s : abcd) {
            System.out.println(s);
        }

    }

    public static List<String> getAnagrams(String input) {
        if (input.length() == 0 || input.length() == 1) {
            List<String> possibleAnagrams = new ArrayList<>();
            possibleAnagrams.add(input);
            return possibleAnagrams;
        }

        List<String> listOfAnaggrams = new ArrayList<>();
        char c = input.charAt(0);
        String subString = input.substring(1);
        List<String> anagrams = getAnagrams(subString);
        addAllAnagrams(anagrams, c, listOfAnaggrams);


        return listOfAnaggrams;
    }

    private static void addAllAnagrams(List<String> listOfAnaggrams, char c, List<String> finalAnagrams) {
        for (String anag : listOfAnaggrams) {
            for (int i = 0; i <= anag.length(); i++) {
                StringBuilder sb = new StringBuilder(anag);
                finalAnagrams.add(sb.substring(0, i) + c + sb.substring(i));
            }
        }

    }

}
