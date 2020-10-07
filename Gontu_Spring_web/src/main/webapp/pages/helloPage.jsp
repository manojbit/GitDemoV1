<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee detail</title>
</head>
<body>
<h1>${frontPage }</h1>
 <table>
 <tr>
 		<td>Employee name </td>
 		<td> ${student.sname } </td>
 </tr>
 
 <tr>
 		<td> Comapany Name </td>
 		<td> ${student.company } </td>
 </tr>
 
 <tr>
 		<td> DOJ </td>
 		<td> ${student.doj } </td>
 </tr>
 
 <tr>
 		<td> Salary</td>
 		<td> ${student.salary } </td>
 </tr>
 
 <tr>
 		<td> Technologies</td>
 		<td> ${student.technologies } </td>
 </tr>
 <tr>
 		<td> Address Detail</td>
 		<td>
 		country:${student.address.country }
 		city:${student.address.city }
 		street:${student.address.street }
 		pincode:${student.address.pincode }
 		</td>
 
 </tr>
 
 </table>
</body>
</html>







