package com.control.statement;

import java.util.Scanner;

public class MaxNo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numbr : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max=a;
		if(b>max)
		{
			max=b;
		}
		if(c>max)
		{
			max=c;
		}
		
		System.out.println(max);
	}
}
