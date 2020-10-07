<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${frontPage }</h1>
	<form:errors path="student.*"/>
	
	<form action="anyName" method="post">
		<table>
			<tr>
				<td>Employee name :</td>
				<td><input type="text" name="sname"></td>
			</tr>

			<tr>
				<td>Company name:</td>
				<td><input type="text" name="company"></td>
			</tr>

			<tr>
				<td>DOJ :</td>
				<td><input type="text" name="doj"></td>
			</tr>

			<tr>
				<td>Salary :</td>
				<td><input type="text" name="salary"></td>
			</tr>

			<tr>
				<td>Technology :</td>
				<td><select name="technologies" multiple="multiple">
						<option value="core java">core java</option>
						<option value="spring">spring</option>
						<option value="hibernate">hibernate</option>
				</select></td>
			</tr>



		</table>
		<table>
			<tr>
				<td>Student Address:::::::::::</td>
			</tr>
			<tr>
				<td>country::<input type="text" name="address.country"></td>
				<td>city::<input type="text" name="address.city"></td>
				<td>street::<input type="text" name="address.street"></td>
				<td>pincode::<input type="text" name="address.pincode"></td>
			</tr>

			<tr>
				<td><input type="submit" value="Press Enter to Proceed"></td>
			</tr>
		</table>

	</form>

</body>
</html>