package com.programing.logical;

import java.util.Scanner;

public class PrimeNo 
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		int i;
		if(n==1)
		{
			System.out.println("prime number start more then 2 ");
		}
		for(i=2; i<n; i++ )
		{
			if(n%i==0)			
			{
				System.out.println("prime not");
				break;
			}
		}
		if(n==i)
			System.out.println("prime number");
	}
}
