package com.multithreading;

public class Class_Yield_B 
{
	public static void main(String[] args) {
		Class_Yield_A cy=new Class_Yield_A();
		cy.start();
		Thread.yield();
		for(int i=1; i<=5; i++) {
			System.out.println("Yield_B : " +i);
		}
	}
}
