package com.slc.springMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		return "index";
//		System.out.println("home page loaded");
	}
	
	
	@RequestMapping("add")
	public ModelAndView add(@RequestParam("num1") int i, @RequestParam("num2") int j) {
		
		ModelAndView mv = new ModelAndView(); // connect the model and view
		mv.setViewName("result");
		
		int num3 = i + j;
		
//		session.setAttribute("num3", num3); //using for result.jsp
		
		mv.addObject("num3", num3);
		
		return mv;
	}
}

// Spring boot config everything for us
// Model.addAttribute("attributeName", variable) --> map an attribute in Tomcat jsp with a variable inside the function
// @ModelAttribute("output") Class input,  auto assign data of a web to a class --> magic
