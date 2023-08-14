package com.String.logic;

import java.util.Scanner;

public class ClassA {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word !! ");
		String input = sc.nextLine();
		int index=input.indexOf(" ");
		
		if(index>=0)
		{
			System.out.println("First word :"+input.substring(0, index));
		}
		else
		{
			System.out.println("word not found !!");
		}
		
	}

}
