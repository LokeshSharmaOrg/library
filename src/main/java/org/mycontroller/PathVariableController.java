package org.mycontroller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class PathVariableController
{
		@RequestMapping("/welcome/{name}/{country}")
		public ModelAndView requestHandle(@PathVariable("name") String name,@PathVariable("country") String country)
		{
			ModelAndView model=new ModelAndView("path");
			model.addObject("Msg","Hello"+name+"You are in "+country);
			String nm=model.getViewName();
			System.out.println("name of view is "+nm);
			return model;
		}
		//@PathVariable annotation with the help of Map for doing this we have to add the
		//<mvc:annotation-driven/> in spring.xml file
		@RequestMapping("/welcome1/{name}/{country}")
		public ModelAndView handleMap(@PathVariable Map<String,String> pathvars)
		{
			String name=pathvars.get("name");
			String country=pathvars.get("country");
			ModelAndView model=new ModelAndView("path");
			model.addObject("Msg","Hello"+name+"You are in "+country);
			return model;	
		}
		@RequestMapping("/lo/{name}/{country}")
		public ModelAndView requestHandle2(@PathVariable("name") String name,@PathVariable("country") String country)
		{
			ModelAndView model=new ModelAndView("path");
			model.addObject("Msg","Hello"+name+"You are in "+country);
			String nm=model.getViewName();
			System.out.println("name of view is "+nm);
			return model;
		}
	
}
