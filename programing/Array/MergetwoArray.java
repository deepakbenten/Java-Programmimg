package com.programing.Array;

public class MergetwoArray 
{
	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {6,7,8,9,10};
		int res[]=new int[arr1.length+arr2.length];
		int k=0;
		for(int i=0; i<arr1.length; i++, k++)
		{
			res[k]=arr1[i];
		}
		for(int i=0; i<arr2.length; i++, k++)
		{
			res[k]=arr2[i];
		}
		for(int i=0; i<res.length; i++)
		{
			System.out.print(res[i]+ " ");
		}
	}

}
