package com.programing.logical;

import java.util.Scanner;

public class Palindrome2 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word : ");
		String word=sc.nextLine();
		
		boolean isPalindrome=true;
		for(int i=0; i<word.length(); i++)
		{
			if(word.charAt(i)!=word.charAt(word.length()-1-i))
			{
				isPalindrome=false;
				break;
			}
		}
		if(isPalindrome)
		{
			System.out.println(word + " : is a palindrome word");
		}
		else {
			System.out.println(word  +" : nat a palindrome word ");
		}
	}

}
