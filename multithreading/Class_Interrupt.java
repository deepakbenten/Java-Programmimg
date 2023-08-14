package com.multithreading;

public class Class_Interrupt extends Thread
{
	public void run() {
		System.out.println("I am ready for interviews..!");
		for(int i=1; i<=5; i++) {
			System.out.println("This is my "+i+" interview..!");
		}
		System.out.println("I got placed now I can relax..!");
		try {
			Thread.sleep(10000); //10 sec
		}catch(Exception e) {
			System.out.println("Some distributed my sleep : ( ");
		}
		System.out.println("Time to go to office : )");
	}
	public static void main(String[] args) {
		Class_Interrupt ci=new Class_Interrupt();
		Thread t1=new Thread(ci);
		t1.start();
		t1.interrupt();
	}
}
