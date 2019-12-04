package com.hcl.junit;

public class Test1 {

	static {
		System.out.println("Hi");
	}
	{
		System.out.println("Hello");
	}
	Test1() {
		System.out.println("Bye");
	}
	public static void main(String[] args) {
		Test1 obj = new Test1();
	}
}
