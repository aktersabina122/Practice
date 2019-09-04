package com.hcl.java;

public class SbExample {

	public void show(int age,String name,String course,String city) {
		
		StringBuilder sbError=new StringBuilder();
		boolean isValid=true;
		
		/* validation for Age */
		if(age <= 20) {
			sbError.append("Age must be greater than 20" + "\r\n");
			isValid=false;
		}
		
		/* validation for Name */ 
		if(name.indexOf(' ')== -1) {
			sbError.append("Name Contains both Firstname and LastName" 
					+ "\r\n");
			isValid=false;
		}
		
		/* validation for Course */
		if(!course.equalsIgnoreCase("JAVA")) {
			sbError.append("Only Java Course Allowed..." +"\r\n");
			isValid=false;
		}
		
		if(isValid==true) {
			System.out.println("Age  " +age);
			System.out.println("Name  " +name);
			System.out.println("Course " +course);
			System.out.println("City  " +city);
		} else {
			System.out.println(sbError);
		}
		
	}
	public static void main(String[] args) {
		int age;
		String name;
		String course;
		String city;
		age=11;
		name="Ram";
		course="Java";
		city="Delhi";
		new SbExample().show(age, name, course, city);
	}
}
