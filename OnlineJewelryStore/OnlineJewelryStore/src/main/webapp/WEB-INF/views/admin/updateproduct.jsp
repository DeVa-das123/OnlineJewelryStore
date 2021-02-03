<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Product</title>
</head>
<body>
<img src="/images/logo.jpg" height="50" width="200">
	<h3>Update Product</h3>
	<form method="post">
		<table style="background-color: cyan; margin: auto;" border="1">
			<tr>
				<td>ProductId</td>
				<td><input type="text" name="proId"
					value="${requestScope.updateproductdetails.productId}"
					readonly="readonly" /></td>
			</tr>
			<tr>
				<td>Name</td>
				<td><input type="text" name="proName"
					value="${requestScope.updateproductdetails.productName}" /></td>
			</tr>
			<tr>
				<td>Description</td>
				<td><input type="text" name="proDescription"
					value="${requestScope.updateproductdetails.productDescription}" /></td>
			</tr>
			<tr>
				<td>Category</td>
				<td><input type="text" name="proCategory"
					value="${requestScope.updateproductdetails.category}"
					readonly="readonly" /></td>
			</tr>
			<tr>
				<td>Price</td>
				<td><input type="text" name="proPrice"
					value="${requestScope.updateproductdetails.productPrice}" /></td>
			</tr>
			<tr>
				<td>ImageUrl</td>
				<td><input type="text" name="proImgUrl"
					value="${requestScope.updateproductdetails.productImageUrl}" /></td>
			</tr>
			
			<tr>
				<td><input type="submit" value="UpdateProduct" /></td>
			</tr>
		</table>
	</form>

</body>
</html>