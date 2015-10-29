<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>LOGIN</title>
</head>
<body>
<form:errors path="user.*" cssClass="alert alert-danger" element="div"/>

	<br /> Enter your new <b>user</b> and <b>password</b>
	<br /> 
	if you try tu user user=<b>hugo</b> you must get an error!! <br /> <br />
	<form action="${flowExecutionUrl}&_eventId=newUserEntered" method="post">

		<input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}" /> 
		
		<table>
			<tr>
				<td>New User:</td>
				<td>	<form:input id="user" path="user.user" type="text" class="form:input-large"/></td>
				<form:errors path="loginName" cssClass="text-danger"/>
			</tr>
			<tr>
				<td>Password:</td>
				<td><form:input id="password" path="user.password" type="password" class="form:input-large"/></td>
			</tr>
		</table>
		

		<br /> <input type="submit" value="add" />

	</form>
</body>
</html>