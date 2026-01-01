package com.interview;
/** Count Vowels
 * "education" → 5
 *  **/
public class CountVowels {
    public static void main(String[] args) {
        String str = "education";
        char[] ch = str.toCharArray();
        int count = 0;
        for (int i =0; i <= ch.length-1;i++) {
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u'
            ) {
                count++;
            }
        }
        System.out.println("Vowels count is here----<><><>: " + count);
    }
}
