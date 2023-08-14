package com.multithreading;

public class Class_Join_B 
{
	public static void main(String[] args) throws InterruptedException  {
		Class_join_A cj=new Class_join_A();
		cj.start();
		//cj.join();
		for(int i=1; i<=5; i++) {
			System.out.println("Join_B : "+i);
		}
	}

}
