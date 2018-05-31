package com.logic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.model.TransactionData;
import com.utilities.*;

public class Transactions {
	
	public static TransactionData deposit (int account_id, float amount) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		String sql = null;
		TransactionData data = null;
		java.sql.Date now = new java.sql.Date(Calendar.getInstance().getTime().getTime());
		
		try {
			Class.forName(Authorization.JDBC_DRIVER);
			connection = DriverManager.getConnection(
					Authorization.DB_URL,
					Authorization.USER_NAME,
					Authorization.PASSWORD);
			statement = connection.createStatement();
			// Select account balance using account ID
			sql = "select balance from account where account_id ="+account_id;
			resultSet = statement.executeQuery(sql);
			System.out.println(sql);
			if (!resultSet.next())
				return null;
			else
				data = new TransactionData(
					SQLQueries.findTotal("transaction")+3001,
					account_id,
					now.toString(),
					amount,
					resultSet.getFloat("balance")+amount,
					"Deposit "+amount
					);
			System.out.println(data.getAll());
			// update balance in account
			sql = "update account set balance = "+ data.getBalance() +"where account_id = "+data.getAccount_id();
			statement.executeUpdate(sql);
			System.out.println(sql);
			

			// insert transaction 
			sql = "insert into transaction values"
					+ "("
					+ "'" + data.getTransaction_id() + "',"
					+ "'" + data.getAccount_id() + "',"
					+ "'" + now + "',"
					+ "'" + data.getAmount() + "',"
					+ "'" + data.getBalance() + "',"
					+ "'" + data.getDescription() + "'"
					+ ")";
			statement.executeUpdate(sql);
			System.out.println(sql);
			
			resultSet.close();
			statement.close();
			connection.close();
			
			return data;
		} catch (SQLException e) {
			System.out.println("Exception : " +e.getMessage());
			return data;
		} catch (Exception e) {
			System.out.println("Exception : " +e.getMessage());
			return data;
		}

	}

	public static TransactionData withdraw (int account_id, float amount) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		String sql = null;
		TransactionData data = null;
		float balance = 0;
		String description;
		java.sql.Date now = new java.sql.Date(Calendar.getInstance().getTime().getTime());
		
		try {
			Class.forName(Authorization.JDBC_DRIVER);
			connection = DriverManager.getConnection(
					Authorization.DB_URL,
					Authorization.USER_NAME,
					Authorization.PASSWORD);
			statement = connection.createStatement();
			// Select account balance using account ID
			sql = "select balance from account where account_id ="+account_id;
			resultSet = statement.executeQuery(sql);
			System.out.println(sql);
			if (!resultSet.next())
				description = "Invalid Account ID";
			else {
				balance = resultSet.getFloat("balance");
				if (balance < amount) {
					
					description = "Insuficient Funds";
				} else {
					balance -= amount;
					description = "Withdrawn "+amount;
				}
			}
			data = new TransactionData(
				SQLQueries.findTotal("transaction")+3001,
				account_id,
				now.toString(),
				amount,
				balance,
				description
			);
			System.out.println(data.getAll());
			// update balance in account
			sql = "update account set balance = "+ data.getBalance() +"where account_id = "+data.getAccount_id();
			statement.executeUpdate(sql);
			System.out.println(sql);

			// insert transaction 
			sql = "insert into transaction values"
					+ "("
					+ "'" + data.getTransaction_id() + "',"
					+ "'" + data.getAccount_id() + "',"
					+ "'" + now + "',"
					+ "'" + data.getAmount() + "',"
					+ "'" + data.getBalance() + "',"
					+ "'" + data.getDescription() + "'"
					+ ")";
			statement.executeUpdate(sql);
			System.out.println(sql);
			resultSet.close();
			statement.close();
			connection.close();
			return data;
		} catch (SQLException e) {
			System.out.println("Exception : " +e.getMessage());
			return data;
		} catch (Exception e) {
			System.out.println("Exception : " +e.getMessage());
			return data;
		}
	}

	public static List<TransactionData> fundsTransfer (int fromAccountID, int toAccountID, float amount) {
		
		TransactionData data = null;
		List<TransactionData> dataList = new ArrayList<TransactionData>();
		
		data = withdraw(fromAccountID, amount);
		dataList.add(data);
		if (data.getDescription().equals("Insuficient Funds") || data.getDescription().equals("Invalid Account ID")) {
			
		}else{
			data = deposit(toAccountID, amount);
			dataList.add(data);
		}
		
		return dataList;
	}


}
