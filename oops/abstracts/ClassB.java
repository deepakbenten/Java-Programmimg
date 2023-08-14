package com.oops.abstracts;

public class ClassB extends ClassA{
	void meth1() {
		System.out.println("Abstract method overridden");
	}
	public static void main(String[] args) {
		ClassA aobj=new ClassB();
		aobj.meth1();
		aobj.meth2();
	}
}
