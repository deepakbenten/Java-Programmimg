package com.oops.polymorphisum;

public class ClassB extends ClassA
{
	void meth1(int x, int y) {
		System.out.println("Addition : "+(x+y));
	}
	public static void main(String[] args) {
		ClassA bobj=new ClassB();
		bobj.meth1(50, 40);
		System.out.println("-----------------------------------");
		
		ClassA aobj=new ClassA();
		aobj.meth1(50, 40);
	}

}
