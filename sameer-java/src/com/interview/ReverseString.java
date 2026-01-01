package com.interview;
/** Reverse String **/
public class ReverseString {
    public static void main(String[] args) {
        String str = "hello sameer";
        char[] ch = str.toCharArray();
        String rev = "";
        for (int i = ch.length-1; i >= 0; i--) {
            rev = rev + ch[i];
        }
        System.out.println("Reverse String " + rev);
    }
}
