package com.multithreading;

public class Class_Yield_A extends Thread {
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("Yield_A : " +i);
		}
	}
}
