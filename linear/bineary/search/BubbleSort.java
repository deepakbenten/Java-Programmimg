package com.linear.bineary.search;

public class BubbleSort 
{
	static void SortBubble(int arr[])
	{
		int n=arr.length-1;
		for(int i=0; i<=n; i++)
		{
			for (int j = i+1; j < n; j++) {
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int arr[]= {9,7,10,15,2,12};
		
		SortBubble(arr);
		for(int x:arr)
		{
			System.out.println(x);
		}
	}

}
