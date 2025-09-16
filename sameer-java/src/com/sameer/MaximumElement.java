package com.sameer;
/*
🔹 1. Find the Maximum Element

Problem:
Given an array arr[] of size N, find the maximum element present in the array
Input:
N = 5
arr[] = {3, 7, 2, 9, 5}
Output:
9
 */

public class MaximumElement {
    public static Integer findMaximumElement(int[] arr) {
        int temp = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > temp) {
                temp = arr[i];
            }
        }
        return  temp;
    }

    public static void main(String[] args) {
//        int arr[] = {3, 7, 2, 9, 5};
       int[] arr =  {-5, -2, -8};
        System.out.println("find maximum number: " + findMaximumElement(arr));


    }
}
