package com.company;

public class PrimeNumbersRecursion 
{
	public static boolean isPrime(int num) {
		if(num <= 1)
		{
			return false;
		}
		else if(num == 2) {
			return true;
		}else if(num % 2 ==0) {
			return false;
		}else {
			return isPrimeHelper(num, 3);
		}
		
	}
	public static boolean isPrimeHelper(int num, int divisor) {
		if(divisor * divisor > num) {
			return true;
		}else if(num%divisor==0) {
			return false;
		}else {
			return isPrimeHelper(num, divisor+2);
		}
	}
	public static void main(String[] args) {
		int[] numbers = {7, 1019, 333, 1071, 9091, 202};
		System.out.print("prime number in the list : ");
		for(int num : numbers) {
			if(isPrime(num)) {
				System.out.print(num + " ");
			}
		}
	}
}
