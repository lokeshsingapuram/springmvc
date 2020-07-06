<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/1.10.21/js/jquery.dataTables.min.js"></script>
<link href="https://cdn.datatables.net/1.10.21/css/jquery.dataTables.min.css" rel="stylesheet" type="text/css">
<script>
function deleteConfirm(){
	return confirm("Are you sure! you want to delete?")
}
$(document).ready(function() {
    $('#ct_dtls').DataTable( {
        "pagingType": "full_numbers"
    } );
} );
</script>
</head>
<body>
<h3>${delete}</h3>
<a href="addContact">Add New Contact</a>
<table border="1" id="ct_dtls">
<thead>
<tr>
<th>S.no</th>
<th>Contact Name</th>
<th>Contact email</th>
<th>Contact phone number</th>
<th>Action</th>
</tr>
</thead>
<tbody>

<c:forEach items="${contacts}" var="contact" varStatus="index">
<tr><td><c:out value="${index.count}"/></td>
<td><c:out value="${contact.contactName}"/></td>
<td><c:out value="${contact.contactEmail}"/></td>
<td><c:out value="${contact.contactPhoneNumber}"/></td>
<td><a href="editContact?contactId=${contact.contactId}">Edit</a>|
<a href="deleteContact?contactId=${contact.contactId}" onclick="{ return deleteConfirm();}">delete</a></td></tr>
</c:forEach>
</tbody>
</table>
</body>
</html>