package com.hcl.employ;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployShowController {

	@RequestMapping("/employshow")
	public ModelAndView showEmp() {
		ApplicationContext ctx=new
		ClassPathXmlApplicationContext("applicationContext.xml");
		DataSource dataSource=
		(DriverManagerDataSource)ctx.getBean("dataSource");
		JdbcTemplate jt = new JdbcTemplate(dataSource);
		String sql="select * from employ";
		List emps=null;
		emps=jt.query(sql,new RowMapper() {
			
			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				String empInfo=rs.getInt("empno")+"----"+
							rs.getString("name") +"----"+
						    rs.getString("dept") +"----"+
							rs.getString("desig")+"----"+
						    rs.getString("basic");
				return empInfo;
			}
		});
		return (new ModelAndView("ShowPage","emps",emps));
	}
	}

