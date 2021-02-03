<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>OrderDetails</title>
</head>
<body>
<img src="/images/logo.jpg" height="50" width="200">
	<a href="/customer/logout">Logout </a>
	<a href="/customer/home" >Home </a>
<h1>In Orderdetails</h1>
	<form >
		<table>
			<tr>
				<td>Orderid:</td>
				<td>
				${sessionScope.order_details.orderId}</td>
			</tr>
			<tr>
				<td>ProductName</td>
				<td>
				${sessionScope.order_details.selectedProductId.getProductName()}</td>
			</tr>
			<tr>
				<td>Orderstatus:</td>
				<td>
				${sessionScope.order_details.orderStatus}</td>
			</tr>
			<tr>
				<td>Total:</td>
				<td>
				${sessionScope.order_details.total}</td>
			</tr>
			

			
		<%-- 	<tr>
				<td><a href="<spring:url value='/customer/buy'/>">pay </a></td>
			</tr> --%>
		


		</table>
	</form>

<a href="payment">pay</a>
</body>
</html>