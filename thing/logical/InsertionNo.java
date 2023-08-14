package com.thing.logical;

public class InsertionNo 
{
	static int arr[]= {2,9,15,11,20,5};
	static int size=6;
	static int elmement=30;
	static int capacity;
	static int index=3;
	
	int IndInsertion(int arr[], int size, int element, int capacity, int index)
	{
		int i;
		size+=1;
		if(size>=capacity)
		{
			return -1;
		}
		for(i=size-1; i>=index; i--)
		{
			arr[i+1]=arr[i];
			
		}
		arr[index]=elmement;
		System.out.println(arr[i]);
		
		return 1;
		
	}
	public static void main(String[] args) {
		InsertionNo in=new InsertionNo();
		
		in.IndInsertion(arr, size, elmement, capacity, index);
		System.out.println("hello");
	}

}
