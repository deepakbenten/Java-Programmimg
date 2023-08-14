package com.normal;

import java.util.Scanner;

public class classb {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		int s=1;
		for (int i = 1; i <=5; i++) {
			s=n*s;
		}
		System.out.println(s);
	}

}
