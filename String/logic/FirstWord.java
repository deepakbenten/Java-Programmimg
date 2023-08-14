package com.String.logic;

import java.util.Scanner;

public class FirstWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        if (words.length > 0) {
            System.out.println("First word: " + words[1]);
        } else {
            System.out.println("No words found.");
        }
    }
}
