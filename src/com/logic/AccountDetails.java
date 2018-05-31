package com.logic;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.model.AccountData;
import com.utilities.*;

public class AccountDetails {
	public static AccountData getByID(int account_id) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		String sql = null;
		AccountData accountData = null;
		try {
			Class.forName(Authorization.JDBC_DRIVER);
			connection = DriverManager.getConnection(Authorization.DB_URL, Authorization.USER_NAME,
					Authorization.PASSWORD);
			statement = connection.createStatement();

			sql = "select * from account where account_id = '"+account_id+"'";
			System.out.println(sql);

			resultSet = statement.executeQuery(sql);
			if (resultSet.next()) {
				accountData = new AccountData(
						resultSet.getInt("account_id"),
						resultSet.getString("account_type"),
						resultSet.getFloat("balance")
						);
			}
			sql = null;
			resultSet.close();
			statement.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("Exception : Account getByID" + e.getMessage());
			return accountData;
		} catch (Exception e) {
			System.out.println("Exception : Account getByID" + e.getMessage());
			return accountData;
		}
		return accountData;
	}
	
	public static List<AccountData> getByType(String account_type) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		String sql = null;
		AccountData accountData = null;
		List<AccountData> accountList = new ArrayList<AccountData>();
		try {
			Class.forName(Authorization.JDBC_DRIVER);
			connection = DriverManager.getConnection(Authorization.DB_URL, Authorization.USER_NAME,
					Authorization.PASSWORD);
			statement = connection.createStatement();

			sql = "select * from account where account_id = '"+account_type.toUpperCase()+"'";
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
			sql = null;
			resultSet.close();
			statement.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("Exception : Account getByType" + e.getMessage());
			return accountList;
		} catch (Exception e) {
			System.out.println("Exception : Account getByType" + e.getMessage());
			return accountList;
		}
		return accountList;
	}
	
	public static List<AccountData> getByBalance(Float balance) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		String sql = null;
		AccountData accountData = null;
		List<AccountData> accountList = new ArrayList<AccountData>();
		try {
			Class.forName(Authorization.JDBC_DRIVER);
			connection = DriverManager.getConnection(Authorization.DB_URL, Authorization.USER_NAME,
					Authorization.PASSWORD);
			statement = connection.createStatement();

			sql = "select * from account where balance = '"+balance+"'";
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
			sql = null;
			resultSet.close();
			statement.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("Exception : Account getByBalance" + e.getMessage());
			return accountList;
		} catch (Exception e) {
			System.out.println("Exception : Account getByBalance" + e.getMessage());
			return accountList;
		}
		return accountList;
	}

	public static List<AccountData> getAll() {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		String sql = null;
		AccountData accountData = null;
		List<AccountData> accountList = new ArrayList<AccountData>();
		try {
			Class.forName(Authorization.JDBC_DRIVER);
			connection = DriverManager.getConnection(Authorization.DB_URL, Authorization.USER_NAME,
					Authorization.PASSWORD);
			statement = connection.createStatement();
	
			sql = "select * from account";
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
			sql = null;
			resultSet.close();
			statement.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("Exception : Account getAll" + e.getMessage());
			return accountList;
		} catch (Exception e) {
			System.out.println("Exception : Account getAll" + e.getMessage());
			return accountList;
		}
		return accountList;
	}

	

}
