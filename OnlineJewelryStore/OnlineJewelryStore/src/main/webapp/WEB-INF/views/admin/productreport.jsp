<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
<img src="/images/logo.jpg" height="50" width="200">
<a href="logout">Logout</a><br>
<a href="/admin/home" >Home </a><br>
	<h1>Product report</h1>
	
	<form>
		<table style="background-color: cyan; margin: auto;" border="1">
			<tr>
			<th>ProductId</th>
				<th>ProductName</th>
				<th>Description</th>
				<th>Price</th>
				<th>Category</th>
				
			</tr>
			<c:forEach var="p" items="${sessionScope.product_list1}">
					<tr>
					<td>${p.productId}</td>
						<td>${p.productName}</td>
						<td>${p.productDescription}</td>
						<td>${p.productPrice}</td>	
						<td>${p.category}</td>
						
							
						<td><a
					href="<spring:url value='/admin/delete?prodId=${p.productId}'/>">Delete
						Product</a>
						<a
					href="<spring:url value='/admin/update?prodId=${p.productId}'/>">Update
						Product</a></td>
								
			</tr>
			</c:forEach>
		</table>
	</form>
</body>
</html>