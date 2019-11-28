package com.hcl.project;

import java.util.List;
import java.util.Scanner;

public class StudentMain {
	
	public static void main(String[] args) {
		int choice;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Options");
			System.out.println("---------");
			System.out.println("1. Add Student");
			System.out.println("2. Show Student");
			System.out.println("3. Search Student");
			System.out.println("4. Update Student");
			System.out.println("5. Delete Student");
			System.out.println("6. Exit");
			System.out.println("Enter Your Choice  ");
			choice=sc.nextInt();
			switch(choice) {
			case 1 : 
				addStudent();
				break;
			case 2 : 
				showStudent();
				break;
			case 3 : 
				searchStudent();
				break;
			case 4 : 
				updateStudent();
				break;
			case 5 :
				deleteStudent();
				break;
			case 6 : 
				return;
			default : 
				System.out.println("Invalid Input");
			}
		} while(choice!=6); 
	}
	public static void updateStudent() {
		Student objStudent=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter StudentNo  ");
		objStudent.setSno(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter Student Name  ");
		objStudent.setName(sc.nextLine());
		System.out.println("Enter Student City  ");
		objStudent.setCity(sc.nextLine());
		System.out.println("Enter Cgp  ");
		objStudent.setCgp(Double.parseDouble(sc.nextLine()));
		StudentBAL obj=new StudentBAL();
		System.out.println(obj.updateStudentBal(objStudent));
	}
	public static void deleteStudent() {
		int sno;
		System.out.println("Enter Student No  ");
		Scanner sc=new Scanner(System.in);
		sno=sc.nextInt();
		StudentBAL obj=new StudentBAL(); 
		System.out.println(obj.deleteStudentBal(sno));
	}
	
	public static void searchStudent() {
		int sno;
		System.out.println("Enter Student No  ");
		Scanner sc=new Scanner(System.in);
		sno=sc.nextInt();
		StudentBAL obj=new StudentBAL(); 
		Student student =obj.searchStudentBal(sno);
		if(student==null) {
			System.out.println("Student record not found...");
		} else {
			System.out.println(student);
		}
	}
	
	public static void showStudent() {
		StudentBAL obj=new StudentBAL();
		List<Student> students=obj.showStudentBal();
		for (Student student : students) {
			System.out.println(student);
		}
	}
	
	public static void addStudent() {
		Student objStudent=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student No ");
		objStudent.setSno(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter Student Name  ");
		objStudent.setName(sc.nextLine());
		System.out.println("Enter Student City  ");
		objStudent.setCity(sc.nextLine());
		System.out.println("Enter Cgp  ");
		objStudent.setCgp(Double.parseDouble(sc.nextLine()));
		
		StudentBAL obj=new StudentBAL();
		try {
			String res=obj.addStudentBal(objStudent);
			System.out.println(res);
		} catch (StudentException e) {
			System.out.println(e.getMessage());
		}
	}
}
