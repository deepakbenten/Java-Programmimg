package com.programing.logical;

import java.util.Arrays;

public class BubbleSort 
{
	public static void SortBuble(int arr[])
	{
		//int n=arr.length;
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=0; j<arr.length-i-1; j++)
			{
				int temp;
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int arr[]= {10,1,8,5,9,4};
		System.out.println("Before Sorting : "+Arrays.toString(arr));
		SortBuble(arr);
		System.out.println("After sorting : "+Arrays.toString(arr));
	}
}
