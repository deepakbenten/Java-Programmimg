package com.programing.Array;

import java.util.Scanner;

public class ReverseNumber 
{
	void reverse()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of Array : ");
		int length=sc.nextInt();
		int arr[]= new int[length];
		
		System.out.println("Enter the ["+length+"] Array number : ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Before the Array : ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		
		for(int i=0; i<arr.length/2; i++)
		{
			int t=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=arr[i];		
		}
		
		System.out.println("After Reverce the Array number :");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) 
	{
		ReverseNumber rn = new ReverseNumber();
		rn.reverse();
		
	}

}
