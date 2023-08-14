package com.multithreading;

public class Class_Synchronization_A extends Thread 
{
	public void run() {
		criticalResource();
	}
	synchronized void criticalResource() {
		String name=Thread.currentThread().getName();
		System.out.println(name + " has extened critical Resource");
		for(int i=1; i<=5; i++) {
			System.out.println(name + " i have : " +i);
		}
		System.out.println(name + " has completed its execution..!");
	}
	public static void main(String[] args) {
		Class_Synchronization_A cs=new Class_Synchronization_A();
		Thread t1=new Thread(cs);
		Thread t2=new Thread(cs);
		
		t1.setName("Tom-Thread");
		t2.setName("Jerry-Thread");
		
		t1.start();
		t2.start();
	}
}
