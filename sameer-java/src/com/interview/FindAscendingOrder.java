package com.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/** Sort a list of integers in ascending order **/
public class FindAscendingOrder {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(10,1,2,39,-4);
       List<Integer> findAscending =  number.stream().sorted().collect(Collectors.toList());
        System.out.println("hello sameer:----> " + findAscending);

    }
}
