package com.multithread;

public class ClassB 
{
	public static void main(String[] args) {
		ClassA aobj=new ClassA();
		new Thread()
		{
			public void run()
			{
				try {
					aobj.with_Draw(15000);
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
		.start();
		new Thread()
		{
			public void run()
			{
				aobj.deposit(10000);
			}
		}
		.start();
	}

}
