<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Cart</title>
</head>
<body>
<h3>Cart</h3>
<img src="/images/logo.jpg" height="50" width="200">
	<a href="/customer/logout">Logout </a>
	<a href="/customer/home" >Home </a>

<table style="background-color: gray; margin: auto; width: 50%;"
		border="1">
		<caption>Product Cart</caption>
		<tr>
			<th>Title</th>
			<th>Description</th>
			<th>Price</th>
			
		</tr>
		<c:forEach var="p" items="${sessionScope.shoppingcart}">
			<tr>
				<td>${p.productName}</td>
				<td>${p.productDescription}</td>
				<td>${p.productPrice}</td>
				<td><a
						href="<spring:url value='/customer/order?prodId=${p.productId}'/>">order
					</a></td>
				
				<%-- <td><a href="/customer/productdetails/${v.vegetableId}">Details</a></td> --%>
			</tr>
		</c:forEach>
	</table>
	<a
						href="<spring:url value='/customer/order?prodId=${p.productId}'/>">Check out
					</a>

</body>
</html>