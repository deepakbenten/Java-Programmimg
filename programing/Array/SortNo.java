package com.programing.Array;

import java.util.Arrays;

public class SortNo 
{
	public static void main(String[] args) {
		int[] arr= {4,9,2,7,10};
		System.out.println(Arrays.toString(arr));
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=0; j<arr.length-i-1; j++)
			{
				if(arr[j] < arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
