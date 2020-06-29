<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BOOk STORE</title>
</head>
<body>
<h2>ADD BOOKS</h2>
<h3>${msg}</h3>
<form:form action="register" modelAttribute="book" method="post">
<table>
<tr>
<td>Book Name:</td>
<td><form:input path="bookName"/></td>
</tr>
<tr>
<td>Book Authour:</td>
<td><form:input path="authour"/></td>
</tr>
<tr>
<td>Book price:</td>
<td><form:input path="price"/></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="ADD BOOK"/></td>
</tr>
</table>
</form:form>
<a href="getDetails">View Books</a>
</body>
</html>