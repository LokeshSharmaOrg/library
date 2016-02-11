package org.mycontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class Hello
{
	@RequestMapping("hello")
	public ModelAndView handleRequestInternal()
	{
		System.out.println("in the controller class");
		ModelAndView model=new ModelAndView("Hellopage");
		model.addObject("Welcome","Hello to the Spring World Lokesh Sharma");
		return model;
	}	
	@RequestMapping("/lokesh")
	public ModelAndView handleRequestInternal1()
	{
		ModelAndView model=new ModelAndView("Hellopage");
		model.addObject("Welcome","Hello to the Spring World Raj Sharma");
		return model;
	}	
	@RequestMapping("/sharma")
	public ModelAndView handleRequestInternal3()
	{
		ModelAndView model=new ModelAndView("Hellopage");
		model.addObject("Welcome","Hello to the Spring World Aryan Sharma");
		return model;
	}	
}
