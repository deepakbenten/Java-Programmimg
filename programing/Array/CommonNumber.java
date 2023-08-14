package com.programing.Array;

public class CommonNumber 
{
	public static void main(String[] args) {
		int arr1[]= {10,11,12,13,14};
		int arr2[]= {11,9,13,8,7};
		
		System.out.println("common the number : ");
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr2.length; j++)
			{
				if(arr1[i] == arr2[j])
				{
					System.out.println(arr1[i]);
					break;
				}
			}
		}
	}
}
