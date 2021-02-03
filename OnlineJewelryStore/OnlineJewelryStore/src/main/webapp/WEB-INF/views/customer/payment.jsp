<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Payment</title>
</head>
<body>
<img src="/images/logo.jpg" height="50" width="200">
	<h1>Payment</h1>
		<a href="/customer/logout">Logout </a>
	<a href="/customer/home" >Home </a>
<form method="post"> <!--  action="customer/payementstatus.jsp" -->
	<table style="background-color: cyan; margin: auto;" border="1">
	<tr>
			<td>Total</td>
			<td><input name="total" type="text"  value="${sessionScope.order_details.total}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>Card No</td>
			<td><input name="cardNo" type="text"   required="required"/></td>
		</tr>
		<tr>
			<td>Name</td>
			<td><input name="name" type="text"   required="required"/></td>
		</tr>
		<tr>
			<td>Expiry</td>
			<td><input name="expiry" type="date"   required="required"/></td>
		</tr>
		<tr>
			<td>CVV</td>
			<td><input name="cvv" type="text"   required="required"/></td>
		</tr>
		<tr>
		<td><input type="submit" value="pay" /></td>
		</tr>
	</table>
	</form>
</body>
</html>