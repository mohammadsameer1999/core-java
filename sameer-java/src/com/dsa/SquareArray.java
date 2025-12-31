package com.dsa;

import java.util.Arrays;

public class SquareArray {
    public static int[] sortedSquares(int[] arr) {
        int n =  arr.length;
        int[] res = new int[n];
        int i = 0;
        int j = n-1;
        for (int s = n-1; s >=0; s--) {
            if (Math.abs(arr[i]) > Math.abs(arr[j])) {
                res[s] = arr[i] *  arr[i];
                i++;
            } else  {
                res[s] = arr[j] *  arr[j];
                j--;
            }
        }
        return  res;


    }
    public static void main(String[] args) {
        int[] arr = {-4, -1, 0,3,10};
        int[] res = sortedSquares(arr);
        for (int nums: res) {
            System.out.println(nums);
        }
//        for (int i = 0; i < arr.length-1; i++) {
//            int sqr = arr[i] * arr[i];
//            System.out.println(sqr);
//        }
    }
}
