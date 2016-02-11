package org.mycontroller;

import java.beans.PropertyEditorSupport;

public class EmployeeNameEditor extends PropertyEditorSupport
{
	//When u will submit the form Spring MVC call the setValue() of this class before performing data binding
	//task for EmployeeName

	@Override
	public void setAsText(String EmployeeName) throws IllegalArgumentException
	{
		String name=EmployeeName;
		if(name.contains("Mr") || name.contains("Ms"))
		{
			setValue(EmployeeName);
		}
		else
		{
			
			name="Mr "+name;
			setValue(name);
		}
	}
}
