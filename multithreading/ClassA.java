package com.multithreading;

public class ClassA extends Thread
{
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("Run method executed : "+i);
		}
	}
	public static void main(String[] args) {
		ClassA aobj=new ClassA();
		aobj.run();
		System.out.println("----------------------------------");
		Thread t1=new Thread(aobj);
		t1.start();
		t1.run();
	}
}

