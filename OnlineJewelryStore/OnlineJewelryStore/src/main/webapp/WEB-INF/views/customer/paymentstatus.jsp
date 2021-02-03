
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>PaymentStatus</title>
</head>
<body>
<img src="/images/logo.jpg" height="50" width="200">
	<a href="/customer/logout">Logout </a>
	<a href="/customer/home" >Home </a>
	<h3>Payment successful</h3>
	<form>
		<table style="background-color: #85bb65; margin: auto; "border="1">
			<tr>
				<td>bill</td>
			</tr>
	
			<tr>
				<td>Name</td>
				<td>${sessionScope.user_details.fname} ${sessionScope.user_details.lname}</td>

			</tr>
			<tr>
				<td>Address</td>
				<td>${sessionScope.user_details.address}</td>

			</tr>
					<tr>
				<td>Payment Mode</td>
				<td>card</td>

			</tr>

			<tr>
			<tr>
				<td>ProductName</td>
				<td>
					${sessionScope.order_details.selectedProductId.getProductName()}</td>
			</tr>


			<tr>
				<td>Total</td>
				<td>${sessionScope.order_details.total}</td>
			</tr>

		</table>
	</form>
</body>
</html>