package com.programing.Array;

public class ReverseNo 
{
	void reverse()
	{
		int arr1[]= {1,2,3,4,5};
		System.out.println("Befor the Reverse : ");
		for(int i=0; i<arr1.length; i++)
		{
			System.out.println(arr1[i]);
		}
		System.out.println("After the Reverse : ");
		for(int i=arr1.length-1; i>=0; --i)
		{
			System.out.println(arr1[i]);
		}
	}
	public static void main(String[] args) {
		ReverseNo rn = new ReverseNo();
		rn.reverse();
	}

}
