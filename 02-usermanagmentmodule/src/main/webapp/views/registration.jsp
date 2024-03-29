<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
	$(document).ready(function(event) {
		$("#email").blur(function() {
			var emailId = $("#email").val();
			$.ajax({
				url : 'validateEmail?email=' + emailId,
				success : function(response) {
					if (response == 'duplicate') {
						$("#dupEmail").html("Email already registered");
						$("#email").focus();
					}
				}
			});
		});

		$("#countryId").change(function() {
			
			$("#stateId").find('option').remove();
			$('<option>').val('').text('-Select-').appendTo("#stateId");
			
			$("#cityId").find('option').remove();
			$('<option>').val('').text('-Select-').appendTo("#cityId");
			
			var countryId = $("#countryId").val();
			$.ajax({
				type : "GET",
				url : "getStates?countryId=" + countryId,
				success : function(res) {
					$.each(res, function(stateId, stateName) {
						$('<option>').val(stateId).text(stateName).appendTo("#stateId");
					});
				}
			});
		});

		$("#stateId").change(function() {
			
			$("#cityId").find('option').remove();
			$('<option>').val('').text('-Select-').appendTo("#cityId");
			
			var stateId = $("#stateId").val();
			$.ajax({
				type : "GET",
				url : "getCities?stateId=" + stateId,
				success : function(data) {
					$.each(data, function(cityId, cityName) {
						$('<option>').val(cityId).text(cityName).appendTo("#cityId");
					});
				}
			});
		});
	});
</script>
</head>
<body>
	<table>
		<form:form action="saveForm" modelAttribute="register" method="post">
			<tr>
				<td>First Name:</td>
				<td><form:input path="firstName" /></td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><form:input path="lastName" /></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><form:input path="email" /> <font color='red'>
						<div id="dupEmail"></div>
				</font></td>
			</tr>
			<tr>
				<td>Phone Number:</td>
				<td><form:input path="phoneNumber" /></td>
			</tr>
			<%-- <tr>
				<td>Date Of Birth:</td>
				<td><form:input type="date" path="dob" /></td>
			</tr> --%>
			<tr>
				<td>Gender:</td>
				<td><form:radiobutton path="gender" value="m" />Male <form:radiobutton
						path="gender" value="f" />Female</td>
			</tr>
			<tr>
				<td>Country:</td>
				<td><form:select path="countryId">
						<form:option value=" ">-select-</form:option>
						<form:options items="${country}" />
					</form:select></td>
			</tr>
			<tr>
				<td>State:</td>
				<td><form:select path="stateId">
						<form:option value=" ">-select-</form:option>
					</form:select></td>
			</tr>
			<tr>
				<td>City:</td>
				<td><form:select path="cityId">
						<form:option value=" ">-select-</form:option>
					</form:select></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="register"></td>
			</tr>
		</form:form>
	</table>
</body>
</html>