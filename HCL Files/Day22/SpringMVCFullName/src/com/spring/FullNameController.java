package com.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FullNameController {
@RequestMapping("/fullname")
public ModelAndView calc(HttpServletRequest req,HttpServletResponse res){
	String a,b;
	String c=null;
	a=req.getParameter("firstName");
	b=req.getParameter("secondName");
	c=a+ " "+b;
	return new ModelAndView("result","result",c);
}
}
