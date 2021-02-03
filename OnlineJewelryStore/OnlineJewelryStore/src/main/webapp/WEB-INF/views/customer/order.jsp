<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Order</title>
</head>
<body>
<img src="/images/logo.jpg" height="50" width="200">
<a href="logout">Logout</a>
	<a href="<spring:url value='/customer/home'/>">Home </a>
	<h3>In order form</h3>
	

	<form method="post">
		<table>
		<tr>
				<td>Your Id</td>
				<td><input type="text" name="uId"
					value="${sessionScope.user_details.userId}"/></td>

			</tr>

			<tr>
				<td>ProductId</td>
				<td><input type="text" name="pId"
					value="${requestScope.theProduct.productId}" readonly="readonly" /></td>

			</tr>
			<tr>
				<td>ProductName</td>
				<td>
				${requestScope.theProduct.productName}</td>
			</tr>

			<tr>
				<td>ProductCategory</td>
				<td>${requestScope.theProduct.category}</td>
			</tr>
			 <tr>
				<td> Enter Address</td><td>
				<textarea rows = "5" cols = "60" name = "address"value="${sessionScope.user_details.address}">
            
         </textarea>
				<%-- <input type="text" name="address"
					value="${sessionScope.user_details.address}" /> --%></td>
			</tr> 
	
				<tr>
				<td>Price</td>
				<td><input type="text" name="price"
					value="${requestScope.theProduct.productPrice}" readonly="readonly" /></td>
			</tr>

<%-- 
			<tr>
				<td>Total</td>
				<td><input type="text" name="total"
					value="${requestScope.theProduct.productPrice}" readonly="readonly" /></td>
			</tr>
 --%>

			<tr>
				<td>Payment Mode</td>
				<td><input type="text" name="paymentMode" value="card" readonly="readonly"/></td>
				
			</tr>
			<tr>
			<td>Quantity</td>
			<td><input type="text" name="quantity" /></td>
			</tr>

		<%-- 	<tr>
				<td><a href="<spring:url value='/customer/buy'/>">pay </a></td>
			</tr> --%>
			<tr>
			<td><td><input type="submit" value="place order" /></td></td>
			</tr>


		</table>
	</form>
</body>
</html>