package com.hcl.junit;

public class Test12 {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object Disposed");
	}
	public static void main(String[] args) {
		Runtime r=Runtime.getRuntime(); 
		
		  System.out.println("Total Memory: "+r.totalMemory());  
		  System.out.println("Free Memory: "+r.freeMemory());  
		    
		  for(int i=0;i<2;i++){  
		   new Test12();  
		  }  
		  System.out.println("After creating 100 instance, Free Memory: "+r.freeMemory());  
		Runtime.getRuntime().gc();  
		  System.out.println("After gc(), Free Memory: "+r.freeMemory());  
		 }  
	
}
