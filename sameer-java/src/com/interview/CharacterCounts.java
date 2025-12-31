package com.interview;
/** write a java program o count how many times a given character appears in a string; **/
public class CharacterCounts {
    public static int countOccuranceOfCharactersJava(String str, char ch) {
        return (int) str.chars().filter(c -> c == ch).count();
    }
    public static int countOccuranceOfCharacters(String str, char ch) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "banana";
        char ch = 'a';
int result  = countOccuranceOfCharacters(str,ch);
int result1 = countOccuranceOfCharactersJava(str,ch);

        System.out.println("Output is Here----<><><> " + result);
        System.out.println("Output is Here----<><><> " + result1);
    }
}
