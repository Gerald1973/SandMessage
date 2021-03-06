<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sign up</title>
</head>
<body>
	<form:form commandName="signupForm" action="addPerson.html">
		<table>
			<tr>
				<td>First name</td>
				<td><form:input path="firstName" /> <form:errors path="firstName" cssStyle="color: #ff0000;"/></td>
			</tr>
			<tr>
				<td>Family name</td>
				<td><form:input path="lastName" />
					<form:errors path="lastName" /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><form:input path="email" />
					<form:errors path="email" /></td>
			</tr>
			<tr>
				<td>Nickname</td>
				<td><form:input path="nickname" />
					<form:errors path="nickname" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><form:password path="password" />
					<form:errors path="password" /></td>
			</tr>
		</table>
		<input type="submit">
	</form:form>
</body>
</html>