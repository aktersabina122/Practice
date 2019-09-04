package com.java.practice;

class First {
	public void show() {
		System.out.println("Show Method from Class First...");
	}
}

class Second extends First {
	public void show() {
		System.out.println("Show Method from class Second...");
	}
}
public class InhDemo {

	public static void main(String[] args) {
//		Second obj=new Second();
//		obj.show();
		
//		First obj1=new Second();
//		obj1.show();
//		
//		Second obj2=new First();
//		obj2.show();
		
		First ob1=new First();
		Second obj2=new Second();
		
		First f1=(First)obj2;
		f1.show();
		
		First f2=(Second)obj2;
		f2.show();
		
		Second f3=(Second) ob1;
		f3.show();
	}
}
