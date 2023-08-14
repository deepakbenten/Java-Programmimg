package com.programing.logical;

import java.util.Scanner;

public class CountNo
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=2454754;
		int count =0;
		while(n > 0)
		{
			int rem = n%10;
			if(rem==5)
			{
				count++;
			}
			n=n/10;
		}
		System.out.println(count);
		
	}

}
