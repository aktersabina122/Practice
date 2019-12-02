package com.hcl.employ;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployDAO {

	Connection connection;
	PreparedStatement pst;
	
	public int generateEmployno() {
		connection=DaoConnection.getConnection();
		String cmd="Select CASE WHEN MAX(Empno) IS NULL THEN 1 "
				+ " ELSE Max(Empno)+1 END empno from Employ";
		int empno=0;
		try {
			pst=connection.prepareStatement(cmd);
			ResultSet rs=pst.executeQuery();
			rs.next();
			empno=rs.getInt("empno");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return empno;
	}
	
	public List<Employ> showEmploy() {
		connection=DaoConnection.getConnection();
		String cmd="select * from Employ";
		Employ employ=null;
		List<Employ> employList=new ArrayList<>();
		try {
			pst=connection.prepareStatement(cmd);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				employ=new Employ();
				employ.setEmpno(rs.getInt("empno"));
				employ.setName(rs.getString("name"));
				employ.setDept(rs.getString("dept"));
				employ.setDesig(rs.getString("desig"));
				employ.setBasic(rs.getInt("basic"));
				employList.add(employ);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employList;
	}
}
