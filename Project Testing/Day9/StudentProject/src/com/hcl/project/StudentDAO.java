package com.hcl.project;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class StudentDAO {

	static List<Student> lstStudent = null;
	static ResourceBundle rb=null;
	
	static {
		lstStudent=new ArrayList<Student>();
		rb=ResourceBundle.getBundle("student");
	}
	
	public String addStudentDao(Student student) {
		lstStudent.add(student);
		return rb.getString("add");
	}
	
	public List<Student> showStudentDao() {
		return lstStudent;
	}
	
	public Student searchStudentDao(int sno) {
		Student objStudent=null;
		for (Student student : lstStudent) {
			if(student.getSno()==sno) {
				objStudent=student;
			}
		}
		return objStudent;
	}
	
	public String deleteStudentDao(int sno) {
		String result="";
		Student student = searchStudentDao(sno);
		if(student !=null) {
			lstStudent.remove(student);
			result="Student Record Deleted Successfully...";
		} else {
			result="Student Record Not Found...";
		}
		return result;
	}
	
	public String updateStudentDao(Student objStudent) {
		Student student=searchStudentDao(objStudent.getSno());
		String result="";
		if(student!=null) {
			for (Student s : lstStudent) {
				if(s.getSno()==objStudent.getSno()) {
					s.setName(objStudent.getName());
					s.setCity(objStudent.getCity());
					s.setCgp(objStudent.getCgp());
				}
			}
			result="Student Record Updated...";
		} else {
			result="Student Record Not Found...";
		}
		return result;
	}
}






