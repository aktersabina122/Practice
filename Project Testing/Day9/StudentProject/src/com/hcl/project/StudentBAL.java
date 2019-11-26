package com.hcl.project;

import java.util.List;

public class StudentBAL { 

	static StringBuilder sb=new StringBuilder();
	
	public boolean check(Student objStudent) {
		boolean isAdded=true;
		if(objStudent.getSno() <= 0) {
			sb.append("StudentNo cannot be Negative or Zero \r\n" );
			isAdded=false;
		}
		if(objStudent.getName().length() <= 3) {
			sb.append("Name More than 3 characters \r\n");
			isAdded=false;
		}
		if(objStudent.getCity().length() <=3) {
			sb.append("City More than 3 characters \r\n");
			isAdded=false;
		}
		if(objStudent.getCgp() < 0) {
			sb.append("Cgp Non-Negative \r\n");
			isAdded=false;
		}
		return isAdded;
	}
	public String addStudentBal(Student objStudent) throws StudentException {
		if(check(objStudent)==true) {
			return new StudentDAO().addStudentDao(objStudent);
		} else {
			throw new StudentException(sb.toString());
		}
		
	}
	
	public List<Student> showStudentBal() {
		return new StudentDAO().showStudentDao();
	}
	
	public Student searchStudentBal(int sno) {
		return new StudentDAO().searchStudentDao(sno);
	}
	
	public String updateStudentBal(Student objStudent) {
		return new StudentDAO().updateStudentDao(objStudent);
	}
	
	public String deleteStudentBal(int sno) {
		return new StudentDAO().deleteStudentDao(sno);
	}
}



