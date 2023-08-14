package com.oops.abstracts;

public abstract class ClassA {
	
	abstract void meth1();
	
	void meth2() {
		System.out.println("ClassA method..2() called");
		this.display();
	}
	static void meth3() {
		System.out.println("ClassA method..3() called");
	}
	void display() {
		System.out.println("Display");
	}
	ClassA(){
		System.out.println("ClassA constractor..!");
	}
	public static void main(String[] args) {
		System.out.println("java is awesome...!");
		ClassA.meth3();
	}
}
