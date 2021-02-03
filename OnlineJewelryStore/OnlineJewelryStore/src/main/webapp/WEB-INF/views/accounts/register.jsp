<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Form</title>
</head>
<body>
<img src="/images/logo.jpg" height="50" width="200">
	<form  method="post">
		<table style="background-color: cyan; margin: auto;" border="1">
		
	<!--   • userId P.K • FName • LName • Email • Password • Address 
	   Role
	  -->
		<tr>
				<td>Enter FirstName</td>
				<td><input type="text" name="fname" required="required"/></td>
			</tr>
			<tr>
				<td>Enter LastName</td>
				<td><input type="text" name="lname" required="required"/></td>
			</tr>
			<tr>
				<td>Enter Address</td>
				<td><input type="text" name="address" required="required"/></td>
			</tr>
			<tr>
						<td>Role</td>
						<td><input type="text" name="role" value="customer"  readonly="readonly"/></td>
						<!-- <td>CUSTOMER<input type="radio" name="role" value="customer"/></td>
						<td>ADMIN<input type="radio" name="role" value="admin"/></td>		 -->
					</tr>
				<tr>
				<td>Enter Email</td>
				<td><input type="text" name="em"  required="required"/></td>
			</tr>
			<tr>
				<td>Enter Password</td>
				<td><input type="password" name="pass" required="required"/></td>
			</tr>

			<tr>
				<td><input type="submit" value="Register" /></td>
			</tr>
		</table>
	</form>
</body>
</html>