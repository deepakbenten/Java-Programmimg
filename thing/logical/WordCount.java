package com.thing.logical;

import java.util.Scanner;

public class WordCount 
{
	void CountWord()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Word : ");
		String str=sc.nextLine();
		int count=0;
		for(int i=0; i<str.length(); i++)
		{
			if(Character.isWhitespace(str.charAt(i)))
			{
				count++;
			}
		}
		count++;
		System.out.println("Count the word : "+count);
	}
	public static void main(String[] args) {
		WordCount wc=new WordCount();
		wc.CountWord();
	}

}
