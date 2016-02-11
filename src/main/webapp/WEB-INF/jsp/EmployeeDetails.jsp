<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div style="height:100px; background-color:grey">
		<center><p><h1>Spring Form Handling</h1><p></center>
	</div>
	<div style="margin-left: auto;margin-right: auto; width: 500px; height: 400px; background-color:silver;border-radius:20px;box-shadow:5px 5px 5px grey">
	<form:errors path="employee.*"/>
	<form action="handlemployee" method="post">
	
	
		<table style="margin-left: 125px">
			<tr>
				<td>Name</td>
				<td><input type="text" name="employeeName"></td>
			</tr>
			<tr>
				<td>CompanyName</td>
				<td><input type="text" name="companyName"></td>
			</tr>
			<tr>
				<td>Mobile Number</td>
				<td><input type="text" name="employeeMobile"></td>
			</tr>
			<tr>
				<td>LandLine Number</td>
				<td><input type="text" name="employeeLandLine"></td>
			</tr>
			<tr>
				<td>Employee Hobby</td>
				<td><input type="text" name="employeeHobby"></td>
			</tr>
			<tr>
				<td>DOB</td>
				<td><input type="text" name="employeeDOB"></td>
			</tr>
			<tr>
				<td>Employee Skills</td>
				<td>
					<select name="employeeSkills" multiple="multiple">
					<option value="core java">Core java</option>
					<option value="JEE">JEE</option>
					<option value="Spring">Spring</option>
					<option value="Hibernate">Hibernate</option>
				</select>
				</td>
			</tr> <!-- employeeAdress is the reference variable of Address class for using AutoData binding we have t
					to use the name of the form field like this -->
			<tr>
				<td>country</td>
				<td><input type="text" name="employeeAddress.country"></td>
			</tr>
			<tr>
				<td>state</td>
				<td><input type="text" name="employeeAddress.state"></td>
			</tr>
			<tr>
				<td>city</td>
				<td><input type="text" name="employeeAddress.city"></td>
			</tr>
			<tr>
				<td>street</td>
				<td><input type="text" name="employeeAddress.street"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit Data"></td>
			</tr>
		</table>
	</form>
	</div>
</body>
</html>