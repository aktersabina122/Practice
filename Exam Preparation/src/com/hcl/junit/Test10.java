package com.hcl.junit;

public class Test10 {

	@Override
	protected void finalize() throws Throwable {
		System.out.println("object is garbage collected");
	}
	public static void main(String[] args) {
		Test10 obj1=new Test10();
		Test10 obj2=new Test10();
		obj2=obj1;
		System.gc();
	}
}
