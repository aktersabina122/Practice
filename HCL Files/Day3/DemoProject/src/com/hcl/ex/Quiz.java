package com.hcl.ex;

public class Quiz {

	public static void main(String[] args) {
		int[] a=new int[]{12,5,3};
		try {
			a[6]=5/0;
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Size Small");
		} catch(ArithmeticException e) {
			System.out.println("Division by zero impossible");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
