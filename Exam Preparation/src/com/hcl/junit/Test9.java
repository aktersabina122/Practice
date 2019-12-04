package com.hcl.junit;

public class Test9 {

	 public void finalize(){System.out.println("object is garbage collected");}  
	 public static void main(String args[]){  
		 Test9 s1=new Test9();  
		 Test9 s2=new Test9();  
	  s1=null;  
	  s2=null;  
	  System.gc();  
	 }  
}
