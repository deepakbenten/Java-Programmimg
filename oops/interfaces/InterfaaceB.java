package com.oops.interfaces;

public interface InterfaaceB {
	void show();
	default void msg() {
		System.out.println("I am from Interface..B");
	}
}
