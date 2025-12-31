package com.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/** Convert all strings in a list to uppercase **/
public class ConvertUppercaseInList {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("sameer","Bob","Hello");
       List<String> convertUpper = str.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(convertUpper);
    }
}
