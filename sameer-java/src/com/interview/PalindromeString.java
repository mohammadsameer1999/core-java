package com.interview;
 /**
 * Palindrome String
  * "madam" → true
  * "java" → false
 */

public class PalindromeString {
    public static boolean checkPalindrome(String str) {
//        char[] ch = str.toCharArray();
//        String rev  = " ";
//        for (int i = ch.length-1;i >=0; i--) {
//            rev = rev + ch[i];
//        }
//        return true;
        int left = 0;
        int right = str.length() -1;
        while (left <= right) {
            if (str.charAt(left) != str.charAt(left)) {
                return false;
            }
                left++;
                right--;
            }

        return true;
    }

     public static void main(String[] args) {
         String str = "madam";


         System.out.println("hello: " + checkPalindrome(str));
     }
}
