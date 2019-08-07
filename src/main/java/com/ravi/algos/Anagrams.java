package com.ravi.algos;

import java.util.ArrayList;
import java.util.List;

public class Anagrams {


    public static void main(String[] args) {
        List<String> theCombination = Anagrams.findAnagrams("ABCD");
        for (String ana : theCombination)
            System.out.println(ana);
    }

    public static List<String> getTheCombination(String input) {

        if (input.length() == 1) {
            List<String> anagaramsList = new ArrayList<>();
            anagaramsList.add(input);
            return anagaramsList;
        }

        List<String> finalList = new ArrayList<>();
        char c = input.charAt(0);

        String subset = input.substring(1, input.length());
        List<String> theCombination = getTheCombination(subset);
        addAllAnagrams(c, theCombination, finalList);
        return finalList;

    }

    private static void addAllAnagrams(char c, final List<String> anagaramsList, List<String> finalList) {
        for (String list : anagaramsList) {
            for (int i = 0; i < list.length(); i++) {
                String substring = list.substring(0, i);
                String substring1 = list.substring(i, list.length());
                String insert = substring.concat("" + c).concat(substring1);
                finalList.add(insert);
            }
        }
    }

    public static List<String> findAnagrams(String word) {
        if (word.length() == 1) {
            List<String> potentialAnagrams = new ArrayList<>();
            potentialAnagrams.add(word);

            return potentialAnagrams;
        }

        List<String> anagramList = new ArrayList<>();
        char currentChar = word.charAt(0);
        String subset = word.substring(1, word.length());

        List<String> potentialAnagramList = findAnagrams(subset);
        insertCharacterAtEveryIndex(potentialAnagramList, currentChar, anagramList);

        return anagramList;
    }

    private static void insertCharacterAtEveryIndex(List<String> potentialAnagramList,
                                                    char currentChar,
                                                    List<String> anagramList) {
        for (String potentialAnagram : potentialAnagramList) {
            // Inserts the current character at every position.
            for (int insertIndex = 0; insertIndex <= potentialAnagram.length(); insertIndex++) {
                StringBuilder sb = new StringBuilder(potentialAnagram);
                if (insertIndex < potentialAnagram.length()) {
                    sb.insert(insertIndex, currentChar);
                } else {
                    sb.append(currentChar);
                }

                anagramList.add(sb.toString());
            }
        }
    }
}
