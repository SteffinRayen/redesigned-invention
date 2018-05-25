package com.logic;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.data.AccountData;
import com.database.Authorization;

public class Account {
	public static AccountData fetchAccountDataByID (int account_id) {
		 
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		String sql = null;
		AccountData data = null;
		
		try {
			Class.forName(Authorization.JDBC_DRIVER);
			connection = DriverManager.getConnection(
					Authorization.DB_URL,
					Authorization.USER_NAME,
					Authorization.PASSWORD);
			statement = connection.createStatement();
			
			// Select account detail using account ID
			sql = "SELECT * FROM account WHERE account_id = '"+account_id+"'";
			resultSet = statement.executeQuery(sql);
			System.out.println(sql);
			
			while (resultSet.next()) {
				data = new AccountData(
						resultSet.getInt("account_id"),
						resultSet.getString("account_type"),
						resultSet.getFloat("balance")
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
	 
	 public static List<AccountData> fetchAllAccountData () {
		 
			Connection connection = null;
			Statement statement = null;
			ResultSet resultSet = null;
			String sql = null;
			AccountData data = null;
			List<AccountData> dataList = new ArrayList<AccountData>();
			
			
			try {
				Class.forName(Authorization.JDBC_DRIVER);
				connection = DriverManager.getConnection(
						Authorization.DB_URL,
						Authorization.USER_NAME,
						Authorization.PASSWORD);
				statement = connection.createStatement();
				
				// Select account detail using account ID
				sql = "SELECT * FROM account ";
				resultSet = statement.executeQuery(sql);
				System.out.println(sql);
				
				while (resultSet.next()) {
					data = new AccountData(
							resultSet.getInt("account_id"),
							resultSet.getString("account_type"),
							resultSet.getFloat("balance")
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
