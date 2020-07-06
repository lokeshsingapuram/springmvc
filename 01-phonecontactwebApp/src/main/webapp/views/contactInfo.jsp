<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="forms"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Phone Book Application</title>
<style type="text/css">
registration.error{
color:red;
}
</style>
<script type="text/javascript"
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.1/jquery.validate.min.js"></script>
<script>
	function submitForm() {
		var validator = $("#registration").validate({
			rules : {
				contactName : "required",
				contactEmail : "required",
				contactPhoneNumber : "required",
			},
			errorElement : "span",
			messages : {
				contactName : " Please Enter your Name",
				contactEmail : "Please Enter your Email",
				contactPhoneNumber : " Please Enter your Contact No",
			}
		});
		if (validator.form()) { // validation perform
			$('form#registration').attr({
				action : 'saveContact'
			});
			$('form#registration').submit();
		}
	}
</script>
</head>
<body>
	<h3>${succMsg}</h3>
	<forms:form action="saveContact" modelAttribute="contact" method="post"
		name="registration" id="registration">
		<table>
			<tr>
				<forms:hidden path="contactId" />
				<td><label  for="contactName">Contact Name:</label></td>
				<td><forms:input path="contactName" /></td>
			</tr>
			<tr>
				<td><label for="contactEmail">Contact Email:</label></td>
				<td><forms:input path="contactEmail" /></td>
			</tr>
			<tr>
				<td><label for="contactPhoneNumber">contact
						PhoneNumber:</label></td>
				<td><forms:input path="contactPhoneNumber" /></td>
			</tr>
			<tr>
				<td><input type="reset" value="reset"></td>
				<td><input type="submit" value="submit" onclick="submitForm();" /></td>
			</tr>
		</table>

		<a href="viewContactInfo">view all contacts</a>
	</forms:form>
</body>
</html>