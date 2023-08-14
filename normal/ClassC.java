package com.normal;

import java.util.Scanner;

public class ClassC 
{
	static int power(int n)
	{
		if(n==0)
		{
			return 1;
		}
		else
		{
			return n*power(n-1);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		
		int value=power(n);
		System.out.println(value);
	}

}
