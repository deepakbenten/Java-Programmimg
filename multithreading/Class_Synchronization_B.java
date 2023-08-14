package com.multithreading;

public class Class_Synchronization_B extends Thread {
	public void run() {
		String name = Thread.currentThread().getName();
		synchronized (this) {

			System.out.println(name + " has extened critical Resource");
			for (int i = 1; i <= 5; i++) {
				System.out.println(name + " i have : " + i);
			}
			System.out.println(name + " has completed its execution..!");
		}
		for (int x = 1; x <= 5; x++) {
			System.out.println(name + " x value : " + x);
		}
	}

	public static void main(String[] args) {
		Class_Synchronization_B cs = new Class_Synchronization_B();
		Thread t1 = new Thread(cs);
		Thread t2 = new Thread(cs);

		t1.setName("First-Thread");
		t2.setName("Second-Thread");

		t1.start();
		t2.start();
	}
}
