package com.linear.bineary.search;

import java.util.Scanner;

public class ClassA 
{
	public static int binearySearch(int arr[], int k) {
		int start=0;
		int end=arr.length-1;
		
		while(start<=end) {
			int mid=(start+end)/2;
			if(arr[mid]==k) {
				return mid;
			}else if(k>arr[mid]) {
				start=mid+1;
			}else if(k<arr[mid]) {
				end=mid-1;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number : ");
		//int t=sc.nextInt();		
		
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0; i<n; i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println("search the number :");
			int k=sc.nextInt();
//			ClassA obj=new ClassA();
//			obj.binearySearch(arr, k, n);
			
			int result = binearySearch(arr, k);
			if(k==-1) {
				System.out.println("not found.....!!");
			}else {
				System.out.println("index posion of K : "+result );
			}
	}

}
