package com.oops;

public abstract class Abstract1 {
	
	abstract void meth1();
	void meth2()
	{
		System.out.println("inside the meth2 method");
		this.display();
	}
	void display()
	{
		System.out.println("insde the display method");
	}
	Abstract1()
	{
		System.out.println("inside the constructor");
	}
	public static void main(String[] args) {
		System.out.println("Java is awesome !!");
	}

}
