package com.multithreading;

public class Class_Prioroty implements Runnable {
	public void run() {
		String name= Thread.currentThread().getName();
		int priority= Thread.currentThread().getPriority();
		for(int i=1; i<=5; i++) {
			System.out.println(name + "(" + priority + ")" + " has executed run() :" +i);
		}
	}
	public static void main(String[] args) {
		Class_Prioroty cp=new Class_Prioroty();
		Thread t1=new Thread(cp);
		Thread t2=new Thread(cp);
		
		t1.setName("First-Thread");
		t2.setName("Second-Thread");
		
		t1.setPriority(1);
		t2.setPriority(10);
		
		t1.start();
		t2.start();
	}
}
