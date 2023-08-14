package com.control.statement;

import java.util.Scanner;

public class Salary 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the Salary Amount :");
		int salary=sc.nextInt();
		
		if(salary > 10000)
		{
			salary = salary + 3000;
		}
		else
		{
			salary = salary + 1000;
		}
		System.out.println(salary);
	}
}
