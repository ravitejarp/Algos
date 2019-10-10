//package com.ravi.interview;
//
//
//import java.io.*;
//import java.util.*;
//
//public class Triplets {
//
//    // Complete the countTriplets function below.
//    static long countTriplets(List<Long> arr, long r) {
//        Map<Long, List<Integer>> map = new HashMap<>();
//        long finalVal = 0;
//        int counter = 0;
//        for (Long val : arr) {
//            if (val == 0) {
//                continue;
//            }
//            if (map.get(val) == null) {
//                List<Integer> index = new ArrayList<>();
//                index.add(counter);
//                map.put(val, index);
//            } else {
//                map.get(val).add(counter);
//            }
//            counter++;
//        }
//        Set<Long> keys = map.keySet();
//        for (Long k : keys) {
//            boolean found = false;
//            List<Integer> integers = map.get(k);
//            for (Integer kk : integers)
//                for (int i = kk + 1; i < counter; i++) {
//                    List<Integer> integers1 = map.get(k * r);
//                    for (Integer kk1 : integers1)
//                        if (integers1.index(i) ! = null){
//                        for (int j = i + 1; j < counter; j++) {
//                            if (map.get(k * r * r).index(j) != null) {
//                                found = true;
//                                finalVal++;
//                                map.get(k * r * r).remove(j);
//                                break;
//                            }
//                        }
//                        if (found) {
//                            integers1.remove(i);
//                        }
//                    }
//                }
//        }
//        return finalVal;
//
//    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] nr = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        int n = Integer.parseInt(nr[0]);
//
//        long r = Long.parseLong(nr[1]);
//
//        String[] arrItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        List<Long> arr = new ArrayList<>();
//
//        for (int i = 0; i < n; i++) {
//            long arrItem = Long.parseLong(arrItems[i]);
//            arr.add(arrItem);
//        }
//
//        long ans = countTriplets(arr, r);
//
//        bufferedWriter.write(String.valueOf(ans));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}
//
//}
