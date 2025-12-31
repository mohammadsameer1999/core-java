package com.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/** Given a list of Integers  returns a list containing only even numbers; **/
public class CheckEvenNumber {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, 8, 12, 16);
        List<Integer> result = arr.stream().filter(even -> even % 2 == 0).collect(Collectors.toList());
        System.out.println(result);
    }
}