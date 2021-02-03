<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
		<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registered</title>
</head>
<body>
<img src="/images/logo.jpg" height="50" width="200">
	<h3>Register Status : ${requestScope.regstatus}</h3>
	
	<a href="<spring:url value='/accounts/login'/>">Click here for login</a>
</body>
</html>