<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Details</title>
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
	<form action="GetCustomerController" method="post">
		<table>
			<tr>
				<td>Customer ID</td>
				<td><input type="text" name="customer_id"></td>
				<td colspan="2"><button type="submit" >Get Details</button></td>
			</tr>
		</table>
	</form>
	<form action="GetAllCustomerController" method="post">
		<table>
			<tr>
				<td ><button type="submit" >Get All Details</button></td>
			</tr>
		</table>
	</form> <br>
	

</body>
</html>