package com.linear.bineary.search;

public class A {
	static int BinearySearch(int arr[], int element)
	{
		int low, middle, high;
		low=0;
		high=arr.length-1;
		while(low<=high)
		{
			middle=(low+high)/2;
			if(arr[middle]==element)
			{
				return middle;
			}
			else if(arr[middle]<element)
			{
				low=middle+1;
			}
			else
			{
				high=middle-1;
			}
			
		}
		
		
		return -1;
	}
public static void main(String[] args) {
	int arr[]= {5,10,15,20,25,30,35,40};
	int element=35;
	int result=BinearySearch(arr, element);
	if(result == -1)
	{
		System.out.println("Vallid input element !!");
	}
	else
	{
		System.out.println("index of array :"+result);
	}
}
}
