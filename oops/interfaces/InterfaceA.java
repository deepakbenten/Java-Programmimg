package com.oops.interfaces;

public interface InterfaceA 
{
	void meth1();
	default void meth2() {
		System.out.println("Default method of interface...A");
		this.meth4();
	}
	static void meth3() {
		System.out.println("static method of interface...A");
	}
	private void meth4() {
		System.out.println("private method of interface...A");
	}
	default void msg() {
		System.out.println("I am from Interface..A");
	}
	
	public static void main(String[] args) {
		System.out.println("main() of Interface...A");
		InterfaceA.meth3();
	}
}
