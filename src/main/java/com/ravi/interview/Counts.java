package com.ravi.interview;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Counts {

    // Complete the freqQuery function below.
    static List<Integer> freqQuery(List<List<Integer>> queries) {
        Map<Integer, Integer> counterMap = new HashMap<>();
        Map<Integer, Integer> valuesMap = new HashMap<>();
        List<Integer> finalList = new ArrayList<>();

        for (List<Integer> query : queries) {
            switch (query.get(0)) {
                case 1:
                    if (counterMap.get(query.get(1)) == null) {
                        counterMap.put(query.get(1), 1);
                        if (valuesMap.get(1) == null) {
                            valuesMap.put(1, 1);
                        } else {
                            valuesMap.put(1, valuesMap.get(1) + 1);
                        }
                    } else {
                        valuesMap.put(counterMap.get(query.get(1)), valuesMap.get(counterMap.get(query.get(1))) - 1);
                        counterMap.put(query.get(1), counterMap.get(query.get(1)) + 1);
                        if (valuesMap.get(counterMap.get(query.get(1))) == null) {
                            valuesMap.put(counterMap.get(query.get(1)), 1);
                        } else {
                            valuesMap.put(counterMap.get(query.get(1)), valuesMap.get(counterMap.get(query.get(1))) + 1);
                        }
                    }
                    break;
                case 2:
                    if (counterMap.get(query.get(1)) != null) {
                        valuesMap.put(counterMap.get(query.get(1)), valuesMap.get(counterMap.get(query.get(1))) - 1);
                        counterMap.put(query.get(1), counterMap.get(query.get(1)) - 1);
                    }
                    break;
                case 3:
                    if (valuesMap.get(query.get(1)) == null) {
                        finalList.add(0);
                    } else {
                        finalList.add(valuesMap.get(query.get(1)));
                    }
            }
        }
        return finalList;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> queries = new ArrayList<>();

        for (int i = 0; i < q; i++) {
            String[] queriesRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> queriesRowItems = new ArrayList<>();

            for (int j = 0; j < 2; j++) {
                int queriesItem = Integer.parseInt(queriesRowTempItems[j]);
                queriesRowItems.add(queriesItem);
            }

            queries.add(queriesRowItems);
        }

        List<Integer> ans = freqQuery(queries);

//        for (int i = 0; i < ans.size(); i++) {
//            bufferedWriter.write(String.valueOf(ans.get(i)));
//
//            if (i != ans.size() - 1) {
//                bufferedWriter.write("\n");
//            }
//        }
//
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }
}

