package com.company;

import java.util.Scanner;

public class Permutations
{
	public static void permute(String perfix, String suffix) {
		int n=suffix.length();
		if(n==0) {
			System.out.println(perfix);
		}else {
		for(int i=0; i<n; i++) {
			permute(perfix+ suffix.charAt(i), suffix.substring(0, i)+ suffix.substring(i+1, n));
		}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word : "); String word=sc.nextLine();
		System.out.println(word);
		permute("", word);
	}

}
