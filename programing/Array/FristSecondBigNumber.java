package com.programing.Array;

public class FristSecondBigNumber 
{
	void FirstSecond()
	{
		int arr[]= {10,15,9,18,12};
		int fbig=arr[0];
		int sbig=arr[1];
		for(int i=1; i<arr.length; i++)
		{
			if(fbig<arr[i])
			{
				sbig=fbig;
				fbig=arr[i];
			}
			else if(sbig<arr[i])
			{
				sbig=arr[i];
			}
		}
		System.out.println("First Biggest number : "+fbig);
		System.out.println("second Bigget number : "+sbig);
		
	}
	public static void main(String[] args) {
		FristSecondBigNumber fs=new FristSecondBigNumber();
		fs.FirstSecond();
	}

}
