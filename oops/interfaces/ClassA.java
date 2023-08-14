package com.oops.interfaces;

public class ClassA extends ClassB implements InterfaceA, InterfaaceB
{
	public void meth1() {
		System.out.println("Interface..A abstract method overriddin..");
	}
	public void show() {
		System.out.println("Interface..B abstract method Overridden..");
	}
	@Override
	public void msg() {
		InterfaceA.super.msg();
		InterfaaceB.super.msg();
	}
	public static void main(String[] args) {
		InterfaceA aobj=new ClassA();
		aobj.meth1();
		aobj.meth2();
		
		InterfaaceB bobj=new ClassA();
		bobj.show();
		System.out.println("-----------------------------------");
		new ClassA().msg();
		System.out.println("-----------------------------------");
		new ClassA().display();
	}
}
