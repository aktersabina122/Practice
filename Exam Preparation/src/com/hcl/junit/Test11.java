package com.hcl.junit;

public class Test11 {

	@Override
	protected void finalize() throws Throwable {
		System.out.println("object is garbage collected");
	}
	public static void main(String[] args) {
		new Test11();
		new Test11();
		System.gc();
	}
}
