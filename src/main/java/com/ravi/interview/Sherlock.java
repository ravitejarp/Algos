package com.ravi.interview;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Sherlock {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the isValid function below.
    static String isValid(String s) {
        Map<Integer, List<Character>> mapCounter = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            updateCounter(mapCounter, 1, s.charAt(i));
            if (mapCounter.size() > 2) {
                return "NO";
            }
        }
        if (mapCounter.size() == 1) {
            return "YES";
        }
        Set<Integer> keys = mapCounter.keySet();
        int[] min_max = new int[2];
        int i = 0;
        for (Integer key : keys) {
            min_max[i++] = mapCounter.get(key).size();
        }
        if (min_max[0] == 1 && min_max[1] == 1) {
            return "YES";
        }

        if (Math.abs(min_max[0] - min_max[1]) > 1) {
            return "NO";
        }
        if (min_max[0] == min_max[1]) {
            return "NO";
        }

        return "YES";

    }

    static void updateCounter(Map<Integer, List<Character>> mapCounter, int count, Character c) {
        if (mapCounter.get(count) == null) {
            List<Character> list = new ArrayList<>();
            list.add(c);
            mapCounter.put(count, list);
        } else {
            List<Character> l = mapCounter.get(count);
            l.add(c);
            mapCounter.put(count, l);
        }
    }

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String s = scanner.nextLine();

        String result = isValid("aabbccddeefghi");

//        bufferedWriter.write(result);
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}

