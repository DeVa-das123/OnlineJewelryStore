<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer report</title>
</head>
<body>
<img src="/images/logo.jpg" height="50" width="200">

	<form>
		<table style="background-color: cyan; margin: auto;" border="1">
			<tr>
				<th>UserId</th>
				<th>FirstName</th>
				<th>LastName</th>
				<th>Email</th>
				<th>Password</th>
				<th>Address</th>

			</tr>
			<c:forEach var="c" items="${requestScope.all_users}">
				<tr>
					<td>${c.userId}</td>
					<td>${c.fname}</td>
					<td>${c.lname}</td>
					<td>${c.email}</td>
					<td>${c.password}</td>					
					<td>${c.address}</td>


					<td><a
						href="<spring:url value='/admin/deleteuser?userId=${c.userId}'/>">delete
							User</a></td>

				</tr>
			</c:forEach>
		</table>
	</form>

</body>
</html>