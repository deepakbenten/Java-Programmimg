package com.programing.logical;

import java.util.Scanner;

public class FibonacciNumber 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=0;
		int b=1;
		int c=0;
		System.out.println("Enter  the range .....");
		int range=sc.nextInt();
		
		System.out.println(a);
		System.out.println(b);
		for(int i=2; i<=range; i++)
		{
			c=a+b;
			if(c<=range)
			{
				System.out.println(c);
				a=b;
				b=c;
			}
		}
				
	}

}
