package com.hcl.ex;

class First {
	public void show() {
		System.out.println("Show Method from First");
	}
}

class Second extends First {
	public void show() {
		System.out.println("Show method from Second");
	}
}
public class ExInh {
	public static void main(String[] args) {
		First ob1=new First();
		Second ob2=(Second)ob1;
		ob2.show();
	}
}
