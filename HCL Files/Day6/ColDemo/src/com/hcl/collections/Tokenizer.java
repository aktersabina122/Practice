package com.hcl.collections;


	import java.util.StringTokenizer;
	public class Tokenizer {
	public static void main(String[] args)
	{
	String s ="this is a test string";
	StringTokenizer obj= new StringTokenizer(s);

	while(obj.hasMoreTokens()) 
	{
	String token= obj.nextToken();
	System.out.println("Token : "+token);
	}
	}
	} 

