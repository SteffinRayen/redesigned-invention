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
			return ErrorStatus.errorCustomerData;
		} catch (Exception e) {
			System.out.println("Exception : Customer Creation" + e.getMessage());
			return ErrorStatus.errorCustomerData;
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
			sql = "insert into account values " + 
						"(" + "'" + accountData.getAccount_id() + "'," 
						+ "'" + (accountData.getAccount_type().toLowerCase().equals("savings account")?"S":"C") + "'," 
						+ "'" + accountData.getBalance() + "'" 
						+ ")";
				System.out.println(sql);
				statement.executeUpdate(sql);
			
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
			return ErrorStatus.errorTransactionData;
		} catch (Exception e) {
			System.out.println("Exception : Transaction Creation" + e.getMessage());
			return ErrorStatus.errorTransactionData;
		}
		return transactionData;
	}

	public static CustomerAccountMapping createCAMapping (int customer_id, int account_id) {
		
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		CustomerData customerData = ErrorStatus.errorCustomerData;
		AccountData accountData = ErrorStatus.errorAccountData;
		CustomerAccountMapping caObject = new CustomerAccountMapping(customer_id, account_id, customerData, accountData);

		try {
			Class.forName(Authorization.JDBC_DRIVER);
			connection = DriverManager.getConnection(Authorization.DB_URL, Authorization.USER_NAME,
					Authorization.PASSWORD);
			statement = connection.createStatement();
			// if customerID exists
			String sqlC = "select * from customer where customer_id='"+caObject.getCustomer_id()+"'";
			System.out.println(sqlC);
			resultSet = statement.executeQuery(sqlC);
			if (resultSet.next()) {
				customerData = new CustomerData(
						resultSet.getInt("customer_id"),
						resultSet.getString("first_name"),
						resultSet.getString("middle_name"),
						resultSet.getString("last_name"),
						resultSet.getString("street"),
						resultSet.getString("city"),
						resultSet.getString("state"),
						resultSet.getString("zip"),
						resultSet.getString("phone"),
						resultSet.getString("email")
						);
				caObject.setCusomterData(customerData);
				// if account_id exists
				String sqlA = "select * from account where account_id='"+caObject.getAccount_id()+"'";
				resultSet = statement.executeQuery(sqlA);
				if (resultSet.next()) {
					accountData = new AccountData(
							resultSet.getInt("account_id"),
							resultSet.getString("account_type"),
							resultSet.getFloat("balance")
							);
					String sqlCA = "select * from customer_account where customer_id='"+caObject.getCustomer_id()+"' and account_id='"+caObject.getAccount_id()+"'";
					resultSet = statement.executeQuery(sqlCA);
					if (resultSet.next()) {
						
					}else {
						String sql = "insert into customer_account values " + 
								"(" + "'" + caObject.getCustomer_id() + "'," 
								+ "'" + caObject.getAccount_id() + "'" 
								+ ")";
						System.out.println(sql);
						statement.executeUpdate(sql);
						sql = null;
						sqlA = null;
						sqlC = null;
						resultSet = null;
						statement = null;
						connection = null;
						
					}
					
				}else {
					sqlA = null;
					sqlC = null;
					statement = null;
					connection = null;
					
				}
			} else {
				sqlC = null;
				statement = null;
				connection = null;
				
			}
			statement.close();
			connection.close();

		} catch (SQLException e) {
			System.out.println("Exception : Account Creation" + e.getMessage());
			return ErrorStatus.errorCustomerAccountMapping;
		} catch (Exception e) {
			System.out.println("Exception : Account Creation" + e.getMessage());
			return ErrorStatus.errorCustomerAccountMapping;
		}
		return caObject;

	}
}
