<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Data User</title>
</head>
<body>
Se ha grabado los datos de tu usuario!!!

	<table>
		<tr>
			<td>Nombre:</td>
			<td>${user.user}</td>
		</tr>
		<tr>
			<td>Password</td>
			<td>${user.password}-${success}</td>
		</tr>
	</table>
<p></p>
<form:errors path="personal.*" cssClass="alert alert-danger" element="div"/>
Favor de capturar la siguiente informacion Personal
<form action="${flowExecutionUrl}&_eventId=newPersonalDataUserEntered" method="post">

		<input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}" /> 
		
		<table>
			<tr>
				<td>Name:</td>
				<td>	<form:input id="name" path="personal.name" type="text" class="form:input-large"/></td>
				<form:errors path="loginName" cssClass="text-danger"/>
			</tr>
			<tr>
				<td>LastName:</td>
				<td><form:input id="lastName" path="personal.lastName" type="text" class="form:input-large"/></td>
			</tr>
			<tr>
				<td>email:</td>
				<td><form:input id="email" path="personal.email" type="text" class="form:input-large"/></td>
			</tr>
		</table>
		

		<br /> <input type="submit" value="add" />

	</form>

</body>
</html>