package com.linear.bineary.search;

import java.util.Iterator;

public class LinearSearch 
{
	static int linear(int arr[], int element)
	{
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==element)
			{
				return i;
			}
		}
		return -1;
		
	}
	public static void main(String[] args) {
		int arr[]= {10,5,14,20,9,25};
		
		System.out.println("Index of arr[] : "+ linear(arr, 14));
		System.out.println("Index of arr[] :"+ linear(arr, 100));
	}

}
