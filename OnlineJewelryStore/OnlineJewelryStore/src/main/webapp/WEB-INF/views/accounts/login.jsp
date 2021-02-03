<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
	<form method="post">
		<img src="/images/logo.jpg" height="50" width="200">
		<table style="background-color: cyan; margin: auto;" border="1">

			<tr>
				<td>Enter Email</td>
				<td><input type="text" name="email" required="required" /></td>
			</tr>
			<tr>
				<td>Enter Password</td>
				<td><input type="password" name="password" required="required" /></td>
			</tr>
			<tr>
				<td>Enter role</td>
				<td>CUSTOMER<input type="radio" name="role" value="customer" /></td>
				<td>ADMIN<input type="radio" name="role" value="admin" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Login" /></td>
			</tr>
			<tr>
				<td><a href="/accounts/register">Register</a>
				</td>
				
			</tr>
		</table>
	</form>
</body>
</html>