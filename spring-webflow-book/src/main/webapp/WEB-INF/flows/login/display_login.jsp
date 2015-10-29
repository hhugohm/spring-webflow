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
<form:errors path="loginCredentials.*" cssClass="alert alert-danger" element="div"/>

	<form action="${flowExecutionUrl}&_eventId=loginCredentialsEntered" method="post">

		<input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}" /> 
		<br /> Enter login name as <b>hugo</b> and password as <b>1234</b> for successfull login.
		<br /> 
		Use any other login name and password for login error. <br /> <br />
		<table>
			<tr>
				<td>Login Name:</td>
				<td>	<form:input id="loginName" path="loginCredentials.loginName" type="text" class="form:input-large"/></td>
				<form:errors path="loginName" cssClass="text-danger"/>
			</tr>
			<tr>
				<td>Password:</td>
				<td><form:input id="loginName" path="loginCredentials.password" type="text" class="form:input-large"/></td>
			</tr>
		</table>

		<br /> <input type="submit" value="Login" />

	</form>
</body>
</html>