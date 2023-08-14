package com.programing.Array;

import java.util.Arrays;

public class sorting 
{
	public static void main(String[] args) {
		int[] arr= {5, 3, 8, 1, 2};
		System.out.println("Array before sorting: " + Arrays.toString(arr));
        
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(arr[i]  >arr[j])
				{
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;					
				}
			}
			
		}
		System.out.println("Array before sorting: " + Arrays.toString(arr));
        
	}
}
