package com.programing.logical;

import java.util.Scanner;

public class ClassA 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		int i;
		if(num==1)
		{
			System.out.println("more the 2 number :");
		}
		for(i=2; i<num; i++)
		{
			if(num%i==0)
			{
				System.out.println("prime not");
				break;
				
			}
		}
		if(num==i)
		{
			System.out.println("prime number");
		}
		
		
	}

}
