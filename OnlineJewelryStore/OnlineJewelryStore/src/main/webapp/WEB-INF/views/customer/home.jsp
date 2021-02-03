<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Home Page</title>
</head>
<body>
<img src="/images/logo.jpg" height="50" width="200">
	

	<%-- <h3>${sessionScope.user_details}</h3>
 --%>
	<%-- <h3>${sessionScope.product_list}</h3> --%>
	<h3>Welcome::${sessionScope.user_details.fname}
		${sessionScope.user_details.lname}</h3>
	<%--   <a href="/customer/cart">Cart:${sessionScope.shoppingcart.size()}</a> --%>
	<a href="<spring:url value='/customer/shoppingcart'/>">Cart:${sessionScope.shoppingcart.size()}
	</a>
		<a href="/customer/logout">Logout </a>
		<a href="/customer/myorders">My Orders </a> 
	
	<form>
		<table style="background-color: cyan; margin: auto;" border="1">
			<tr>
				<th>ProductName</th>
				<th>Description</th>
				<th>Price</th>
				<th>Category</th>
			</tr>
			<c:forEach var="p" items="${sessionScope.product_list}">
				<tr>
					<td>${p.productName}</td>
					<td>${p.productDescription}</td>
					<td>${p.productPrice}</td>
					<td>${p.category}</td>
					<td><a
						href="<spring:url value='/customer/cart?prodId=${p.productId}'/>">add
							to cart</a></td>
					<td><a
						href="<spring:url value='/customer/order?prodId=${p.productId}'/>">order
					</a></td>
				</tr>
			</c:forEach>
		</table>
	</form>



</body>
</html>