<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%> --%>
<%--   <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Product Form</title>
</head>
<body>
	<form method="post">
		<table style="background-color: cyan; margin: auto;" border="1">
			<%-- 		<tr>
				<td>Enter Product Category</td>
				<td><form:input path="selectedCategory" /></td>
			</tr>  --%>


			<tr>
				<td>Enter Product Name</td>
				<%-- <td><form:input path="productName" /></td> --%>
				<td><input type="text" name="proName" /></td>
			</tr>
			<tr>
				<td>Enter Product Description</td>
				<td><input type="text" name="proDescription" /></td>
			</tr>
			<tr>
				<td>Enter Product Price</td>
				<td><input type="text" name="proPrice" /></td>
			</tr>
			<tr>
				<td>Enter ProductImg path</td>
				<td><input type="text" name="proImageUrl" /></td>
			</tr>
			<tr>
				<td>Enter Product Category</td>
				<td><input type="text" name="proCategory" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Add New Product" /></td>
			</tr>
		</table>
	</form>
</body>
</html>