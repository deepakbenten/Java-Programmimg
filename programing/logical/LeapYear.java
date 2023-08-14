package com.programing.logical;

import java.util.Scanner;

public class LeapYear 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year : ");
		int year=sc.nextInt();
		//boolean isLeapYear=false;
		if(year%4==0 || year%400==0 || year%100==0)
		{
			//isLeapYear=true;
			System.out.println("Leap year : ");
		}
		
		else
		{
			System.out.println("Not leap year "+year);
		}
	}

}
