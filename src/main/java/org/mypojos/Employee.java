package org.mypojos;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

public class Employee
{
	@Pattern(regexp="[^0-9]*",message="please enter a valid name")
	private String employeeName;
	@Size(min=2,max=5)
	private String companyName;
	
	private long employeeMobile;
	private String employeeHobby;
	@Past
	private Date employeeDOB;
	private ArrayList<String> employeeSkills;
	private Address employeeAddress;
	public long getEmployeeMobile()
	{
		return employeeMobile;
	}
	public void setEmployeeMobile(long employeeMobile)
	{
		this.employeeMobile = employeeMobile;
	}
	public Address getEmployeeAddress()
	{
		return employeeAddress;
	}
	public void setEmployeeAddress(Address employeeAddress)
	{
		this.employeeAddress = employeeAddress;
	}
	public String getEmployeeName()
	{
		return employeeName;
	}
	public void setEmployeeName(String employeeName)
	{
		this.employeeName = employeeName;
	}
	public String getCompanyName()
	{
		return companyName;
	}
	public void setCompanyName(String companyName)
	{
		this.companyName = companyName;
	}
	public String getEmployeeHobby()
	{
		return employeeHobby;
	}
	public void setEmployeeHobby(String employeeHobby)
	{
		this.employeeHobby = employeeHobby;
	}
	public Date getEmployeeDOB()
	{
		return employeeDOB;
	}
	public void setEmployeeDOB(Date employeeDOB)
	{
		this.employeeDOB = employeeDOB;
	}
	public ArrayList<String> getEmployeeSkills()
	{
		return employeeSkills;
	}
	public void setEmployeeSkills(ArrayList<String> employeeSkills)
	{
		this.employeeSkills = employeeSkills;
	}
	
	
	
	

}
