package com.opps.encapsulation;

import java.util.Scanner;

public class ClassB {
	public void meth1() {
		Scanner sc=new Scanner(System.in);
		ClassA obj=new ClassA();
		System.out.println("Enter the Roll no :");
		obj.setRollNo(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter the Student Name : ");
		obj.setStuName(sc.nextLine());
		
		System.out.println("Enter the Student fee : ");
		obj.setStuFee(sc.nextDouble());
		
		
		System.out.println("Student Roll no : "+obj.getRollNo());
		System.out.println("Student Name : "+obj.getStuName());
		System.out.println("student fee : "+obj.getStuFee());
	}
	public static void main(String[] args) {
		new ClassB().meth1();
	}

}
