package com.pattern;

import java.util.Scanner;

public class ClassA 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		int i=1;
		while(i<=n)
		{
			int j=1;
			while(j<n)
			{
				System.out.print("*");
				j=j+1;
			}
			System.out.println();
			i=i+1;
		}
	}

}
