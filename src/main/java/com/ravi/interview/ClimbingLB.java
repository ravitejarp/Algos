package com.ravi.interview;

import java.util.HashMap;
import java.util.Map;

public class ClimbingLB {
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] ranks = new int[alice.length];
        int counter = 0;
        int rank = 1;
        int i = 0;
        int j = alice.length - 1;
        while (i < scores.length && j >= 0) {
            if (scores[i] > alice[j]) {
                if (map.get(scores[i]) == null) {
                    map.put(scores[i], rank++);
                }
                i++;
            } else {
                if (map.get(alice[j]) == null) {
                    map.put(alice[j], rank++);
                }
                j--;
            }
        }
        while (i < scores.length) {
            if (map.get(scores[i]) == null) {
                map.put(scores[i], rank++);
            }
            i++;
        }
        while (j >= 0) {
            if (map.get(alice[j]) == null) {
                map.put(alice[j], rank++);
            }
            j--;
        }

        for (int k = 0; k < alice.length - 1; k++) {
            ranks[counter++] = map.get(alice[k]);
        }

        return ranks;

    }


    public static void main(String[] args) {
        int[] ints = climbingLeaderboard(new int[]{100, 100, 50, 40, 40, 20, 10}, new int[]{5, 25, 50, 120});
        for (int i : ints) {
            System.out.println(i + "\t");
        }
    }
}
