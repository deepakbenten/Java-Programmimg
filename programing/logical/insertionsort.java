package com.programing.logical;

import java.util.Arrays;

public class insertionsort 
{
	public static void sortInsertion(int arr[])
	{
		for(int i=1; i<arr.length; i++)
		{
			int temp=arr[i];
			int j=i-1;
			for(; j>=0; j--)
			{
				if(arr[j]>temp)
				{
					arr[j+1]=arr[j];
					
				}
				else {
					break;
				}
			}
			arr[j+1]=temp;
		}
	}
	public static void main(String[] args) {
		int arr[]= {10,5,9,1,4,7};
		System.out.println("Before sorting : "+Arrays.toString(arr));
		sortInsertion(arr);
		System.out.println("After the sorting : "+Arrays.toString(arr));
	}
}
