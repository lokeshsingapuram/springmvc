<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>User Registration Form</h2>
	<form action="register" method="post">

		<table>
			<tr>
				<td>UserName:</td>
				<td><input type="text" name="userName" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td>Phone Number</td>
				<td><input type="text" name="phoneNumber" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" name="Register" /></td>
			</tr>
		</table>
	</form>
</body>
</html>