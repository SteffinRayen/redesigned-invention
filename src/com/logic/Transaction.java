package com.logic;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.data.TransactionData;
import com.database.Authorization;

public class Transaction {
	public static TransactionData fetchTransactionDataByID (int transaction_id) {
		 
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		String sql = null;
		TransactionData data = null;
		
		try {
			Class.forName(Authorization.JDBC_DRIVER);
			connection = DriverManager.getConnection(
					Authorization.DB_URL,
					Authorization.USER_NAME,
					Authorization.PASSWORD);
			statement = connection.createStatement();
			
			// Select transaction detail using transaction ID
			sql = "SELECT * FROM transaction WHERE transaction_id = '"+transaction_id+"'";
			resultSet = statement.executeQuery(sql);
			System.out.println(sql);
			
			while (resultSet.next()) {
				data = new TransactionData(
						resultSet.getInt("transaction_id"),
						resultSet.getInt("account_id"),
						resultSet.getDate("time_stamp"),
						resultSet.getFloat("amount"),
						resultSet.getFloat("balance"),
						resultSet.getString("description")
						);
			}
			
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
	 
	 public static List<TransactionData> fetchAllTransactionData () {
		 
			Connection connection = null;
			Statement statement = null;
			ResultSet resultSet = null;
			String sql = null;
			TransactionData data = null;
			List<TransactionData> dataList = new ArrayList<TransactionData>();
			
			
			try {
				Class.forName(Authorization.JDBC_DRIVER);
				connection = DriverManager.getConnection(
						Authorization.DB_URL,
						Authorization.USER_NAME,
						Authorization.PASSWORD);
				statement = connection.createStatement();
				
				// Select transaction detail using transaction ID
				sql = "SELECT * FROM transaction ";
				resultSet = statement.executeQuery(sql);
				System.out.println(sql);
				
				while (resultSet.next()) {
					data = new TransactionData(
							resultSet.getInt("transaction_id"),
							resultSet.getInt("account_id"),
							resultSet.getDate("time_stamp"),
							resultSet.getFloat("amount"),
							resultSet.getFloat("balance"),
							resultSet.getString("description")
							);
					dataList.add(data);
				}
				
				resultSet.close();
				statement.close();
				connection.close();
				
				return dataList;
				
			} catch (SQLException e) {
				System.out.println("Exception : " +e.getMessage());
				return dataList;
			} catch (Exception e) {
				System.out.println("Exception : " +e.getMessage());
				return dataList;
			}
		 }

}
