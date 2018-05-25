package com.logic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.data.CustomerData;
import com.database.Authorization;

public class Customer {
	 public static CustomerData fetchCustomerDataByID (int customer_id) {
		 
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		String sql = null;
		CustomerData data = null;
		
		try {
			Class.forName(Authorization.JDBC_DRIVER);
			connection = DriverManager.getConnection(
					Authorization.DB_URL,
					Authorization.USER_NAME,
					Authorization.PASSWORD);
			statement = connection.createStatement();
			
			// Select customer detail using customer ID
			sql = "SELECT * FROM customer WHERE customer_id = '"+customer_id+"'";
			resultSet = statement.executeQuery(sql);
			System.out.println(sql);
			
			while (resultSet.next()) {
				data = new CustomerData(
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
	 
	 public static List<CustomerData> fetchAllCustomerData () {
		 
			Connection connection = null;
			Statement statement = null;
			ResultSet resultSet = null;
			String sql = null;
			CustomerData data = null;
			List<CustomerData> dataList = new ArrayList<CustomerData>();
			
			
			try {
				Class.forName(Authorization.JDBC_DRIVER);
				connection = DriverManager.getConnection(
						Authorization.DB_URL,
						Authorization.USER_NAME,
						Authorization.PASSWORD);
				statement = connection.createStatement();
				
				// Select customer detail using customer ID
				sql = "SELECT * FROM customer ";
				resultSet = statement.executeQuery(sql);
				System.out.println(sql);
				
				while (resultSet.next()) {
					data = new CustomerData(
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
