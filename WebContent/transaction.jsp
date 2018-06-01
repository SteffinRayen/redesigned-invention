<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Transactions</title>
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
	<form action="DepositServlet" method="post">
		<table>
			<tr>
				<td>Account ID</td>
				<td><input type="text" name="account_id"></td>
			</tr>
			<tr>
				<td>Amount</td>
				<td><input type="text" name="amount"></td>
			</tr>
			<tr>
				<td colspan="2"><button type="submit" >Deposit</button></td>
			</tr>
		</table>
	</form>
	<form action="WithdrawServlet" method="post">
		<table>
			<tr>
				<td>Account ID</td>
				<td><input type="text" name="account_id"></td>
			</tr>
			<tr>
				<td>Amount</td>
				<td><input type="text" name="amount"></td>
			</tr>
			<tr>
				<td colspan="2"><button type="submit" >Withdraw</button></td>
			</tr>
		</table>
	</form><br>
	<form action="FundsTransferServlet" method="post">
		<table>
			<tr>
				<td>From Account ID</td>
				<td><input type="text" name="fromAccountID"></td>
			</tr>
			<tr>
				<td>To Account ID</td>
				<td><input type="text" name="toAccountID"></td>
			</tr>
			<tr>
				<td>Amount</td>
				<td><input type="text" name="amount"></td>
			</tr>
			<tr>
				<td colspan="2"><button type="submit" >Transfer</button></td>
			</tr>
		</table>
	</form>
</body>
</html>