package com.company;

import java.util.Scanner;

public class LargestPrimeNumberWithoutMethod 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		System.out.println("----------------------------------");
		int arr[]=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		int largePrime=0;
		for(int i=0; i<n; i++) {
			boolean isPrimeN=true;
			for(int j=2; j<arr[i]/2; j++) {
				if(arr[i]%j==0) {
					isPrimeN=false;
					break;
				}
			}
			if(isPrimeN && arr[i]> largePrime) {
				largePrime=arr[i];
			}
		}
		if(largePrime==0) {
			System.out.println("There is no prime number in the list");
		}else {
			System.out.println("large prime number : " +largePrime);
		}
	}

}
