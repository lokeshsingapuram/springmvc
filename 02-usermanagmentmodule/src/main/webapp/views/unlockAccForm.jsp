<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Management Module</title>
</head>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">

function validatePwds(){

	var newPwd=$('#newPwd').val();
	var confirmPwd=$('#confirmPwd').val();
	if(newPwd!=confirmPwd){

		$('#errid').text("New password and confirm password must and should be same");
		return false;
		}
	return true;
}

</script>
<body>
<h1>unlock Account</h1>
<font color="red"><span id="errid"></span></font><span id="errid"></span>
<form:form action="unlockAcc" modelAttribute="unlockAcc" method="post">
<table>
<tr>
<td>Your Email:</td>
<td>${email}</td>
</tr>

<tr>
<td>Enter temporary password:</td>
<td><form:password path="tempPwd"/></td>
</tr>
<tr>
<td>Enter new password:</td>
<td><form:password path="newPwd"/></td>
</tr>
<tr>
<td>confirm password:</td>
<td><form:password path="confirmPwd"/></td>
</tr>

<tr>
<td></td>
<td><input type="submit" value="unlock Account" onclick="return validatePwds()"></td>
</tr>
</table>


</form:form>
</body>
</html>