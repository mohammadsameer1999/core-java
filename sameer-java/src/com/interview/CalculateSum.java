package com.interview;

import java.util.Arrays;
import java.util.List;

/** Calculate the sum of elements in a list of integers **/
public class CalculateSum {
    public static void main(String[] args) {
    List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9);
    int sumOfInteger = num.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sumOfInteger);
    }
}
