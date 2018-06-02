package com.logic;

import java.sql.*;
import java.util.*;

import com.model.*;
import com.utilities.*;

public class CustomerAccount {
	public static CustomerAccountArray getAccountDetailsByCustomerID(int customer_id) {
		CustomerAccountArray result= null;
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		String sql = null;
		AccountData accountData= null;
		AccountData accountArray[] = null;
		List<AccountData> accountList= new ArrayList<AccountData>();
		try {
			Class.forName(Authorization.JDBC_DRIVER);
			connection = DriverManager.getConnection(Authorization.DB_URL, Authorization.USER_NAME,
					Authorization.PASSWORD);
			statement = connection.createStatement();

			sql = "select A.account_id, A.account_type, A.balance from customer_account as CA Inner Join account as A on CA.account_id = A.account_id Inner Join customer as C on CA.customer_id = C.customer_id where C.customer_id= '"+customer_id+"'";
			System.out.println(sql);

			resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				accountData = new AccountData(
						resultSet.getInt("account_id"),
						resultSet.getString("account_type"),
						resultSet.getFloat("balance")
						);
				accountList.add(accountData);
			}
			accountArray = ConvertListToArray.accountDetails(accountList).getAccountDataArray();
			result = new CustomerAccountArray(customer_id, accountArray);
			sql = null;
			resultSet.close();
			statement.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("Exception : CustomerAccountArray getAccountDetailsByCustomerID" + e.getMessage());
			return result;
		} catch (Exception e) {
			System.out.println("Exception : CustomerAccountArray getAccountDetailsByCustomerID" + e.getMessage());
			return result;
		}
		
		
		return result;
	}
	public static AccountCustomerArray getCustomerDetailsByAccountID(int account_id) {
		AccountCustomerArray result= null;
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		String sql = null;
		CustomerData customerData= null;
		CustomerData customerArray[] = null;
		List<CustomerData> customerList= new ArrayList<CustomerData>();
		try {
			Class.forName(Authorization.JDBC_DRIVER);
			connection = DriverManager.getConnection(Authorization.DB_URL, Authorization.USER_NAME,
					Authorization.PASSWORD);
			statement = connection.createStatement();

			sql = "select C.customer_id,C.first_name,C.middle_name,C.last_name,C.street,C.city,C.state,C.zip,C.phone,C.email from customer_account as CA Inner Join account as A on CA.account_id = A.account_id Inner Join customer as C on CA.customer_id = C.customer_id where A.account_id= '"+account_id+"'";
			System.out.println(sql);
			
			resultSet = statement.executeQuery(sql);
			System.out.println("List created");
			
			while (resultSet.next()) {
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
				customerList.add(customerData);
			}
			System.out.println("List created");
			customerArray = ConvertListToArray.customerDetails(customerList).getCustomerDataArray();
			result = new AccountCustomerArray(account_id, customerArray);
			sql = null;
			resultSet.close();
			statement.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("Exception : AccountCustomerArray getCustomerDetailsByAccountID" + e.getMessage());
			return result;
		} catch (Exception e) {
			System.out.println("Exception : AccountCustomerArray getCustomerDetailsByAccountID" + e.getMessage());
			return result;
		}
		return result;
	}
	
	public static String createCustomerAccountMapping (int customer_id, int account_id) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		String sql = null;
		String result = null;
		
		try {
			Class.forName(Authorization.JDBC_DRIVER);
			connection = DriverManager.getConnection(Authorization.DB_URL, Authorization.USER_NAME,
					Authorization.PASSWORD);
			statement = connection.createStatement();

			sql = "select customer_id from customer where customer_id = '"+customer_id+"'";
			System.out.println(sql);
			resultSet = statement.executeQuery(sql);
			if(resultSet.next()) {
				sql = "select account_id from account where account_id = '"+account_id+"'";
				System.out.println(sql);
				resultSet = statement.executeQuery(sql);
				if(resultSet.next()) {
					sql = "insert into customer_account values ('"+customer_id+"','"+account_id+"')";
					System.out.println(sql);
					statement.executeUpdate(sql);
					result = "Mapping Created";
				}else {
					result =  "Account ID does not exist";
				}
			}else {
				result =  "Customer ID does not exist";
			}
			
			sql = null;
			resultSet.close();
			statement.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("Exception : AccountCustomerArray createCustomerAccountMapping" + e.getMessage());
			return "SQL Error";
		} catch (Exception e) {
			System.out.println("Exception : AccountCustomerArray createCustomerAccountMapping" + e.getMessage());
			return "Exclipse Error";
		}
		return result;
	}
}
