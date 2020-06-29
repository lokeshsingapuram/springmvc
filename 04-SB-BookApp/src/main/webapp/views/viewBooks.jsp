<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
table, th, td ,tr{
background-color: teal;
  color: white;
	border: 1px solid black;
	width: 40%;
}

tr:hover {
	background-color: #f5f5f5;
}
body {
text-align:center;
}
table.center {
    margin-left:auto; 
    margin-right:auto;
  }
</style>
</head>
<body>
<h2 align="center">All Books Details</h2>
	<table class="center">
		<thead>
			<tr>
				<th>BooK Id</th>
				<th>Book Name</th>
				<th>Book Author</th>
				<th>Book Price</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td><c:forEach items="${books}" var="book">
						<tr>
							<td><c:out value="${book.bookId}" /></td>
							<td><c:out value="${book.bookName}" /></td>
							<td><c:out value="${book.authour}" /></td>
							<td><c:out value="${book.price}" /></td>
						</tr>
					</c:forEach></td>
			</tr>
		</tbody>
	</table>
	<a href="book">Go Back</a>
</body>
</html>