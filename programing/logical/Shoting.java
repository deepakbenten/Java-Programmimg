package com.programing.logical;

import java.util.Arrays;

public class Shoting {
	
	void withoutMethod()
	{
		int[] arr1 = { 2, 5, 9, 7 };
		int i;
		for( i=0; i<arr1.length; i++)
		{
			for(int j=i; j<arr1.length; j++)
			{
				int temp;
				if(arr1[i]>arr1[j])
				{
					temp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
				}
			}
			System.out.print(arr1[i]+", ");
		}
		System.out.println("****************************");
		for(i=arr1.length-1; i>arr1.length-4; i--) {
			System.out.print(arr1[i]+" , ");
		}
		
		
	}
	void methCall() {
		int[] arr1 = { 2, 5, 9, 7, 4 };

		Arrays.toString(arr1);
		Arrays.sort(arr1);
		System.out.println("With Method : "+Arrays.toString(arr1));

	}

	public static void main(String[] args) {
		Shoting obj=new Shoting();
		obj.methCall();
		System.out.println("----------------------------------------");
		obj.withoutMethod();
	}

}
