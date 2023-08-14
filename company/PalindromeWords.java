package com.company;
public class PalindromeWords {
    public static void main(String[] args) {
        String sentence = "Madam Arora teaches Malayalam";
        String[] words = sentence.split(" ");
        for (String word : words) {
            boolean palindrome = true;
            int i = 0, j = word.length() - 1;
            while (i < j) {
                if (word.charAt(i) != word.charAt(j)) {
                    palindrome = false;
                    break;
                }
                i++;
                j--;
            }
            if (palindrome) {
                System.out.print(word+", ");
            }
        }
    }
}
