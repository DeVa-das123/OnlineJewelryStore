<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MyOrders</title>
</head>
<body>
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

</body>
</html>