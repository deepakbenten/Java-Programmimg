package com.opps.inheritanse;

public class Student 
{
	protected void studentDetails() {
		String Name="Deepak kumar";
		String Address="Ramgarh";
		System.out.println("Name : " +Name);
		System.out.println("Addresss : " +Address);
	}
	Student()
	{
		System.out.println("Student class default Constructor...!");
	}
	Student(long Mobile){
		
		System.out.println("Mobile number : " +Mobile);
	}
}
