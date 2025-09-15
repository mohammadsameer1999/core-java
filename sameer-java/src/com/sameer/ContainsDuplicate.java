package com.sameer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

Example 1:

Input: nums = [1, 2, 3, 3]

Output: true

Example 2:

Input: nums = [1, 2, 3, 4]

Output: false
 */
// This is brute force soluction
//public class ContainsDuplicate {
//    public static boolean hasDuplicate(int[] nums) {
//        Arrays.sort(nums); // sort first
//
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] == nums[i-1]) {
//                return  true;
//            }
//        }
//
//        return false;
//
//    }
//    public static void main(String[] args) {
//        int[] nums = {1,2,3,3};
//        System.out.println("Hello Mistar: " + hasDuplicate(nums));
//    }
//}

public class ContainsDuplicate {
    public static boolean hasDuplicate(int[] nums) {
        Set<Integer> checkElement = new HashSet<>();
        for (int ele : nums) {
            if (checkElement.contains(ele)) {
                return true;
            }
            checkElement.add(ele);
        }
        return  false;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,3};
        System.out.println("hello " + hasDuplicate(nums));
    }
}