package com.hcl.junit;

import java.util.HashMap;
import java.util.Map;

public class Data {
	
	int div(int a,int b) throws ArithmeticException{
		int c=1;
		c=a/b; 
		return c;
	}
	String getProperty(String key){
		Map<String,String> m=new HashMap<String,String>();
		m.put("Meena","Java");
		m.put("Bhargav","Reddy");
		m.put("Harish","K");
		m.put("Sai","Bharath");
		return m.get(key);
	}
	
	boolean even(int x){
		if(x%2==0){
			return true;
		}
		else {
			return false;
		}
	}
	
	int minArray(int[] x){
		  int min=x[0];  
	        for(int i=0;i<x.length;i++){  
	            if(min >= x[i])  
	                min=x[i];  
	        }  
	        return min;  
	}
	int max(int a,int b,int c) {
		int m=a;
		if(m < b) {
			m=b;
		} 
		if (m < c) {
			m=c;
		}
		return m;
	}

	int sum(int a,int b) {
		return a+b;
	}
	String sayHello() { 
		return "Welcome to Java.";
	}
}
