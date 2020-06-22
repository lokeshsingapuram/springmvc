<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><font color="Green">${success}</font></h1>
<h3><font color="Green">student Details</font></h3>
<h3><font color="Green">student ID::${student.studentId}</font></h3>
<h3><font color="Green">student Name::${student.studentName}</font></h3>
<h3><font color="Green">student email::${student.email}</font></h3>
<h3><font color="Green">student address::${student.studentAddress}</font></h3>
<h3><font color="Green">student gender::${student.gender}</font></h3>
<h3><font color="Green">student course ${student.courses}</font></h3>
<h3><font color="Green">student timings::${student.preferedTimings}</font></h3>
</body>
</html>