package com.normal;

import java.util.Scanner;

public class ClassA 
{
	static int power(int n,int p)
	{
		if(p==1)
		{
			return n;
		}
		else
		{
			return n*power(n,p-1);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		int p=sc.nextInt();
		int value=power(n,p);
		System.out.println(value);
	}

}
