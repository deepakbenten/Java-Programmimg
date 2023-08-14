package com.multithreading;

public class Class_join_A extends Thread
{
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("Join_A : "+i);
		}
	}

}
