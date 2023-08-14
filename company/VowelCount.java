package com.company;

import java.util.Scanner;

public class VowelCount
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word : ");
		String str=sc.nextLine();
		int count=0;
		
		for(int i=0; i<str.length(); i++) {
			char c=str.charAt(i);
			if(isVowel(c))
			{
				count++;
			}
		}
		System.out.println("the number of vowels in the string is :"+count);
	}
	public static boolean isVowel(char c) {
		 c=Character.toLowerCase(c);
		 return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
		
	}

}
