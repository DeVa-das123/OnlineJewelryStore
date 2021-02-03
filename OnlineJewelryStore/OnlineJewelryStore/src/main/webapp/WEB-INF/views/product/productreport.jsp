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
	<h1>Product report</h1>
	<form>
		<table style="background-color: cyan; margin: auto;" border="1">
			<tr>
				<th>ProductName</th>
				<th>Description</th>
				<th>Price</th>
				<th>Delete</th>
				<th>Update</th>
			</tr>
			<c:forEach var="p" items="${sessionScope.product_list}">
					<tr>
						<td>${p.productName}</td>
						<td>${p.productDescription}</td>
						<td>${p.productPrice}</td>	
						<td>${p.category}</td>	
						<td><a
					href="<spring:url value='/admin/delete?prodId=${p.productId}'/>">Delete
						Product</a></td>	
						<td><a
					href="<spring:url value='/admin/update?prodId=${p.productId}'/>">Delete
						Product</a></td>	
							
								
			</tr>
			</c:forEach>
		</table>
	</form>
</body>
</html>