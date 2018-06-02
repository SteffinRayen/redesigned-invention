<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Index</title>
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
			<td><input type="button" onclick="OpenPage('viewC.jsp')" value="View Customer Details"></td>
		</tr>
		<tr>
			<td><input type="button" onclick="OpenPage('viewA.jsp')" value="View Account Details"></td>
		</tr>
		<tr>
			<td><input type="button" onclick="OpenPage('viewAC.jsp')" value="View Customer-Account Details"></td>
		</tr>
		
		<tr>
			<td><input type="button" onclick="OpenPage('viewT.jsp')" value="View Transaction Details"></td>
		</tr>
		<tr>
			<td><input type="button" onclick="OpenPage('create.jsp')" value="Create Details"></td>
		</tr>
		<tr>
			<td><input type="button" onclick="OpenPage('transaction.jsp')" value="Transactions"></td>
		</tr>
	</table>			
				
		
</body>
</html>