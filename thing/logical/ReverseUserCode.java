package com.thing.logical;

import java.util.Scanner;

public class ReverseUserCode 
{
	public static void reverseNo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		int arr[]=new int[num];
		int rev=0;
		while(num!=0)
		{
			 rev=rev*10+(num%10);
			 num=num/10;
		}
		System.out.println("Reverse the number : "+rev);
	}
	public static void main(String[] args) {
		
		ReverseUserCode obj=new ReverseUserCode();
		obj.reverseNo();
		
		
	}

}
