package com.hcl.ex;



class NegativeException extends Exception {
	public NegativeException(String error) {
		super(error);
	}
}

public class Custom {

	public void sum(int a,int b) throws NegativeException,
			NumberZeroException {
		int c;
		boolean flag=true;
		if(a < 0 || b < 0) {
			flag=false;
			throw new NegativeException("Negative Nos Not Allowed...");
		}
		if(a==0 || b==0) {
			flag=false;
			throw new NumberZeroException("Zero is Invalid...");
		}
		if(flag==true) {
			c=a+b;
			System.out.println("Sum is  " +c);
		}
	}
	public static void main(String[] args) {
		int a=5,b=-12;
		try {
			new Custom().sum(a, b);
		} catch (NegativeException | NumberZeroException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
