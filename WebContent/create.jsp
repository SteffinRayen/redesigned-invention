<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Create</title>
	<script type="text/javascript">
		function OpenPage(pageUrl) {
			window.location.href = pageUrl;
		}
	
	</script>
	<link rel="stylesheet" href="css/main.css">

</head>
<body>
	<table>
		<tr>
			<td><input type="button" onclick="OpenPage('index.jsp')" value="Go to Index"></td>
		</tr>
	</table><br>
	<form action="CreateCustomerController" method="post">
		<table>	
			<tr>
				<td>Account ID</td>
				<td><input type="text" name="customer_id"></td>
			</tr>
			<tr>
				<td>First Name</td>
				<td><input type="text" name="first_name"></td>
			</tr>
			<tr>
				<td>Middle Name</td>
				<td><input type="text" name="middle_name"></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><input type="text" name="last_name"></td>
			</tr>
			<tr>
				<td>Street</td>
				<td><input type="text" name="street"></td>
			</tr>
			<tr>
				<td>City</td>
				<td><input type="text" name="city"></td>
			</tr>
			<tr>
				<td>State</td>
				<td><input type="text" name="state"></td>
			</tr>
			<tr>
				<td>Zip</td>
				<td><input type="text" name="zip"></td>
			</tr>
			<tr>
				<td>Phone</td>
				<td><input type="text" name="phone"></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td colspan="2"><button type="submit" >Create Customer</button></td>
			</tr>
		</table>
	</form><br>
	<form action="CreateAccountController" method="post">
		<table>
			<tr>
				<td>Account ID</td>
				<td><input type="text" name="account_id"></td>
			</tr>
			<tr>
				<td>Account Type (S/C)</td>
				<td><input type="text" name="account_type"></td>
			</tr>
			<tr>
				<td>Balance</td>
				<td><input type="text" name="balance"></td>
			</tr>
			<tr>
				<td colspan="2"><button type="submit" >Create Account</button></td>
			</tr>
		</table>
	</form>
	
	
</body>
</html>