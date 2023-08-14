package com.oops.polymorphisum;

public class Sun 
{
	void meth1(int a) {
		System.out.println("sun class in meth1...!"+a);
	}
	void meth1(String b) {
		System.out.println("sun class in meth2...!"+b);
	}
	public static void main(String[] args) {
		Sun obj=new Sun();
		obj.meth1(101);
		obj.meth1("deepak");
		//obj.meth2();
		main("java is awesome");
		main(1256);
	}
	public static void main(String s) {
		System.out.println("main mehod s...!");
	}
	public static void main(int a) {
		System.out.println("main method a...!"+a);
	}
}
