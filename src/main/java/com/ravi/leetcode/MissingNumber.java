package com.ravi.leetcode;

import java.util.ArrayList;
import java.util.List;

public class MissingNumber {
    public static void main(String[] args) {
        MissingNumber missingNumber = new MissingNumber();
        missingNumber.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> listOfInt = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != -1) {
                int temp = nums[nums[i - 1]];
                nums[nums[i - 1]] = -1;
                nums[i] = temp;
                System.out.println(temp);
                System.out.println(nums[i]);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != -1) {
                int temp = nums[nums[i - 1]];
                nums[nums[i - 1]] = -1;
                nums[i] = temp;
                System.out.println(temp);
                System.out.println(nums[i]);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != -1) {
                listOfInt.add(i);
                System.out.println(nums[i]);
            }
        }
        return listOfInt;
    }
}
