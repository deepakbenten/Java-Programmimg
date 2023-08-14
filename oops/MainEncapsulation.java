package com.oops;

import java.util.Scanner;

public class MainEncapsulation 
{
	void maeth1()
	{
		Scanner sc=new Scanner(System.in);
		Encapsulation1 obj=new Encapsulation1();
		
		System.out.println("enter the id : ");
		obj.setId(sc.nextInt());
		System.out.println("ener the name : ");
		sc.nextLine();
		obj.setName(sc.nextLine());
		
		System.out.println("enter the city : ");
		obj.setCity(sc.nextLine());
		System.out.println("enter the mobile number");
		obj.setMobile(sc.nextLong());
		System.out.println("------------------------------------------------");
		
		  System.out.println(obj.getId()); System.out.println(obj.getName());
		  System.out.println(obj.getCity()); System.out.println(obj.getMobile());
		 
	}
	public static void main(String[] args) {
		new MainEncapsulation().maeth1();
		
	}

}
