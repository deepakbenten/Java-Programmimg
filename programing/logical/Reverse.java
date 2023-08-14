package com.programing.logical;

public class Reverse 
{
	public static void main(String[] args) {
		System.out.println("Enter the number : ");
		int n=7584964;
		int ans=0;
		while(n > 0)
		{
			int rem=n%10;
			n /=10;
			ans=ans*10+rem;
		}
		System.out.println(ans);
	}

}
