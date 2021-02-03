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
	<h1>Product List</h1>
	<form>
		<table style="background-color: cyan; margin: auto;" border="1">
			<hr></hr>
			<tr>
			
				<td>Product List</td>
				<td><c:forEach var="p" items="${sessionScope.product_list}">
						<ol>
							<li>ProductName:${p.productName}</li>
							<li>Description:${p.productDescription}</li>
							<li>Price:${p.productPrice}</li>
						</ol>

					</c:forEach></td>
			</tr>
		</table>
	</form>
</body>
</html>