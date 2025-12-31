package com.dsa;
/*
Given an array arr consisting of only 0's and 1's in random order.
 Modify the array in-place to segregate 0s onto the left side and 1s onto the right side of the array.

Input: arr[] = [0, 0, 1, 1, 0]
Output: [0, 0, 0, 1, 1]
Explanation:  After segregation, all the 0's are on the left and 1's are on the right. Modified array will be [0, 0, 0, 1, 1].
 */

import java.util.Arrays;

public class Rearrange {

    void segregate0and1(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] == 0) {
                left++;
            }
            else if (arr[right] == 1) {
                right--;
            }
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 0};

        Rearrange obj = new Rearrange();
        obj.segregate0and1(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }    }
}
