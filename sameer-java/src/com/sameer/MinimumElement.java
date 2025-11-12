package com.sameer;

/*
🔹 2. Find the Minimum Element

Problem:
Given an array arr[] of size N, find the minimum element present in the array.

Input: N = 5
arr[] = {3, 7, 2, 9, 5}
Output: 2
 */

public class MinimumElement {
    public static  int findMinimumElement(int[] arr) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++ ) {
            if (arr[i] < temp) {
                temp = arr[i];
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 9, 5};
        System.out.println("Minimum number: " + findMinimumElement(arr));
    }

}
