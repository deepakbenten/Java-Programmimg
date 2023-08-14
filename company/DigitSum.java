package com.company;

import java.util.Scanner;

public class DigitSum 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=sc.nextInt();
		int sum =0;
		
		while (num > 0 || sum > 9) {
			 if (num == 0) {
			        num = sum;
			        sum = 0;
			    }
			  sum += num % 10;
			    num /= 10;
		}
		System.out.println("The final sum is : "+sum);
			
	}
	
}

