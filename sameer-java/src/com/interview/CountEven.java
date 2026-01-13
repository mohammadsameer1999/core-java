package com.interview;

public class CountEven {
    public static int checkEvenCount(int[] arr) {
        int count  = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] input = {1,2,3,4,6};
        int result = checkEvenCount(input);
        System.out.println(result);
    }
}
