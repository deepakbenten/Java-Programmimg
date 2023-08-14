package com.oops;

public class MainAbstract extends Abstract1
{
	void meth1()
	{
		System.out.println("Main class inside the meth1 ");
	}
	public static void main(String[] args) {
		Abstract1 obj=new MainAbstract();
		obj.meth1();
		obj.meth2();
	}

}
