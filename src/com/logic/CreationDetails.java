package com.logic;

import java.sql.*;

import com.model.*;
import com.utilities.*;

public class CreationDetails {
	public static CustomerData createCustomer(CustomerData customerData) {

		customerData.setCustomer_id(SQLQueries.findTotal("customer") + 1001);

		Connection connection = null;
		Statement statement = null;
		String sql = null;

		try {
			Class.forName(Authorization.JDBC_DRIVER);
			connection = DriverManager.getConnection(Authorization.DB_URL, Authorization.USER_NAME,
					Authorization.PASSWORD);
			statement = connection.createStatement();

			sql = "insert into customer values " 
					+ "(" 
					+ "'" + customerData.getCustomer_id() + "'," 
					+ "'" + customerData.getFirst_name() + "'," 
					+ "'" + customerData.getMiddle_name() + "'," 
					+ "'" + customerData.getLast_name() + "'," 
					+ "'" + customerData.getStreet() + "'," 
					+ "'" + customerData.getCity() + "'," 
					+ "'" + customerData.getState() + "'," 
					+ "'" + customerData.getZip() + "'," 
					+ "'" + customerData.getPhone() + "'," 
					+ "'" + customerData.getEmail() + "'" 
					+ ")";
			System.out.println(sql);
			statement.executeUpdate(sql);

			sql = null;
			statement.close();
			connection.close();

		} catch (SQLException e) {
			System.out.println("Exception : Customer Creation" + e.getMessage());
			return customerData;
		} catch (Exception e) {
			System.out.println("Exception : Customer Creation" + e.getMessage());
			return customerData;
		}
		return customerData;
	}

	public static AccountData createAccount(AccountData accountData) {

		accountData.setAccount_id(SQLQueries.findTotal("account") + 2001);

		Connection connection = null;
		Statement statement = null;
		String sql = null;

		try {
			Class.forName(Authorization.JDBC_DRIVER);
			connection = DriverManager.getConnection(Authorization.DB_URL, Authorization.USER_NAME,
					Authorization.PASSWORD);
			statement = connection.createStatement();
			if (accountData.getAccount_type().toLowerCase().equals("s") || accountData.getAccount_type().toLowerCase().equals("c") ) {
				sql = "insert into account values " + 
						"(" + "'" + accountData.getAccount_id() + "'," 
						+ "'" + (accountData.getAccount_type().toLowerCase().equals("savings account")?"S":"C") + "'," 
						+ "'" + accountData.getBalance() + "'" 
						+ ")";
				System.out.println(sql);
				statement.executeUpdate(sql);
			} else {
				accountData = new AccountData(0, "Error", 0);
			}
			
			sql = null;
			statement.close();
			connection.close();

		} catch (SQLException e) {
			System.out.println("Exception : Account Creation" + e.getMessage());
			return accountData;
		} catch (Exception e) {
			System.out.println("Exception : Account Creation" + e.getMessage());
			return accountData;
		}
		return accountData;
	}

	public static TransactionData createTransaction(TransactionData transactionData) {

		transactionData.setTransaction_id(SQLQueries.findTotal("transaction") +3001);

		Connection connection = null;
		Statement statement = null;
		String sql = null;

		try {
			Class.forName(Authorization.JDBC_DRIVER);
			connection = DriverManager.getConnection(Authorization.DB_URL, Authorization.USER_NAME,
					Authorization.PASSWORD);
			statement = connection.createStatement();

			sql = "insert into transaction values " 
					+ "(" 
					+ "'" + transactionData.getTransaction_id() + "'," 
					+ "'" + transactionData.getAccount_id() + "'," 
					+ "'" + java.sql.Date.valueOf(transactionData.getDate()) + "'," 
					+ "'" + transactionData.getAmount() + "'," 
					+ "'" + transactionData.getBalance() + "'," 
					+ "'" + transactionData.getDescription() + "'" 
					+ ")";
			System.out.println(sql);
			statement.executeUpdate(sql);

			sql = null;
			statement.close();
			connection.close();

		} catch (SQLException e) {
			System.out.println("Exception : Transaction Creation" + e.getMessage());
			return transactionData;
		} catch (Exception e) {
			System.out.println("Exception : Transaction Creation" + e.getMessage());
			return transactionData;
		}
		return transactionData;
	}

}
