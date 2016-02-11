package org.mycontroller;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Map;

import org.mypojos.Employee;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController
{
	@RequestMapping("/employee")
	public ModelAndView employeeForm()
	{
		
		ModelAndView model=new ModelAndView("EmployeeDetails");
		return model;
	}
	/*@RequestMapping(value="/handlemployee", method=RequestMethod.POST)
	public ModelAndView handlemployee(@RequestParam(value="ename") String ename,@RequestParam("cname") String cname)
	{
		System.out.println("name of employee is "+ename);
		System.out.println("company of employee is "+cname);
		ModelAndView model=new ModelAndView("showEmployee");
		model.addObject("employee","hello "+ename+"You are working at"+cname);
		return model;
	}*/
	/*@RequestMapping(value="/handlemployee",method=RequestMethod.GET)
	 *@Requestparam using Map 
	public ModelAndView handleGetEmployee(@RequestParam Map<String,String> var)
	{
		String ename=var.get("ename");
		String cname=var.get("cname");
		ModelAndView model=new ModelAndView("showEmployee");
		model.addObject("employee","hello "+ename+"You are working at"+cname);
		return model;
		
	}*/
	/*@RequestMapping(value="/handlemployee",method=RequestMethod.GET)
	public ModelAndView handleGetEmployee1(@RequestParam Map<String,String> var)
	{
		String ename=var.get("ename");
		String cname=var.get("cname");
		Employee e=new Employee();
		e.setEmployeeName(ename);
		e.setCompanyName(cname);
		ModelAndView model=new ModelAndView("showEmployee");
		//model.addObject("employee","hello "+ename+"You are working at"+cname);
		model.addObject("employee",e);
		return model;
		
	}*/
	@RequestMapping(value="/handlemployee",method=RequestMethod.POST)
	public ModelAndView handleGetEmployee2(@Validated @ModelAttribute("employee") Employee employee,BindingResult result)
	{
		/*BindingResult is used to handle the binding related errors or we can say catch the binding related 
		  error */
		/*@ModelAttribute annotation is used to Auto data binding feature*/
		if(result.hasErrors())
		{
			System.out.println("here come when binding error");
			ModelAndView model=new ModelAndView("EmployeeDetails");
			return model;
		}
		ModelAndView model=new ModelAndView("showEmployee");
		return model;
		
	}
	//@ModelAttribute annotation at method level
	@ModelAttribute
	public void CommenMethod(Model m)
	{
		
		m.addAttribute("header","this header is added to each call of controller ");
	}
	//@InitBinder Annotation is use to customize the data binding  feature */
	//There are many Property Editor classes in the Spring framework which are used for type conversion during
	// data binding CustomDateEditor are one of them and many more i.e NumberEditor.
	//Here we customize the date format using built in PropertyEditor class i.e CustomDateEditor and we also
	// customize the Employee name Using our own EmployeeNameEditor class
	@InitBinder
	public void customizeDataBinding(WebDataBinder binder)
	{
		binder.setDisallowedFields(new String[] {"employeeMobile"});
		SimpleDateFormat format=new SimpleDateFormat("yyyy****MM****dd");
		binder.registerCustomEditor(Date.class,"employeeDOB",new CustomDateEditor(format, false));
		binder.registerCustomEditor(String.class, "employeeName",new EmployeeNameEditor());
	}
}
													