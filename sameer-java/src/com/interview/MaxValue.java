package com.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/** Find the maximum value  in a list integers **/
public class MaxValue {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(2,8,12,5,7);
      Optional<Integer> findmax =  number.stream().max(Integer::compareTo);
        System.out.println(findmax.get());
    }
}
