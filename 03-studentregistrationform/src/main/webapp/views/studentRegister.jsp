<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Student Registration Form</h1>
	<table>
		<form:form action="register" modelAttribute="student" method="post">
			<tr>
				<td>StudentID::</td>
				<td><form:input path="studentId" /></td>
			</tr>
			<tr>
				<td>StudentName::</td>
				<td><form:input path="studentName" /></td>
			</tr>
			<tr>
				<td>Email::</td>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<td>password::</td>
				<td><form:password path="password" /></td>
			</tr>
			<tr>
				<td>StudentAddress::</td>
				<td><form:input path="studentAddress" /></td>
			</tr>
			<tr>
				<td>Gender::</td>
				<td><form:radiobutton path="gender" value="m" />male</td>
				<td><form:radiobutton path="gender" value="f" />female</td>
			</tr>
			<tr>
				<td>Country:</td>
				<td><select name="courses">
						<option value="-">--Please Select</option>
						<option value="java" selected="selected">java</option>
						<option value="python">Python</option>
						<option value="Spring">spring</option>
				</select></td>
			</tr>
			<tr>
				<td><form:checkbox path="preferedTimings" value="morning" />Morning</td>
				<td><form:checkbox path="preferedTimings" value="evening" />Evening</td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Register"></td>
			</tr>
		</form:form>
	</table>

</body>
</html>