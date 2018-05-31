package com.logic;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.model.TransactionData;
import com.utilities.Authorization;

public class TransactionDetails {
	public static TransactionData getByID(int transaction_id) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		String sql = null;
		TransactionData transactionData = null;
		try {
			Class.forName(Authorization.JDBC_DRIVER);
			connection = DriverManager.getConnection(Authorization.DB_URL, Authorization.USER_NAME,
					Authorization.PASSWORD);
			statement = connection.createStatement();

			sql = "select * from transaction where transaction_id = '"+transaction_id+"'";
			System.out.println(sql);

			resultSet = statement.executeQuery(sql);
			if (resultSet.next()) {
				transactionData = new TransactionData(
						resultSet.getInt("transaction_id"),
						resultSet.getInt("account_id"),
						resultSet.getDate("time_stamp").toString(),
						resultSet.getFloat("amount"),
						resultSet.getFloat("balance"),
						resultSet.getString("description")
						);
			}
			sql = null;
			resultSet.close();
			statement.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("Exception : Transaction getByID" + e.getMessage());
			return transactionData;
		} catch (Exception e) {
			System.out.println("Exception : Transaction getByID" + e.getMessage());
			return transactionData;
		}
		return transactionData;
	}
	public static List<TransactionData> getByAccountID(int account_id) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		String sql = null;
		TransactionData transactionData = null;
		List<TransactionData> transactionList = new ArrayList<TransactionData>();
		try {
			Class.forName(Authorization.JDBC_DRIVER);
			connection = DriverManager.getConnection(Authorization.DB_URL, Authorization.USER_NAME,
					Authorization.PASSWORD);
			statement = connection.createStatement();

			sql = "select * from transaction where account_id = '"+account_id+"'";
			System.out.println(sql);

			resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				transactionData = new TransactionData(
						resultSet.getInt("transaction_id"),
						resultSet.getInt("account_id"),
						resultSet.getDate("time_stamp").toString(),
						resultSet.getFloat("amount"),
						resultSet.getFloat("balance"),
						resultSet.getString("description")
						);
				transactionList.add(transactionData);
			}
			sql = null;
			resultSet.close();
			statement.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("Exception : Transaction getByAccountID" + e.getMessage());
			return transactionList;
		} catch (Exception e) {
			System.out.println("Exception : Transaction getByAccountID" + e.getMessage());
			return transactionList;
		}
		return transactionList;
	}
	public static List<TransactionData> getByTimeStamp(String time_stamp) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		String sql = null;
		TransactionData transactionData = null;
		List<TransactionData> transactionList = new ArrayList<TransactionData>();
		try {
			Class.forName(Authorization.JDBC_DRIVER);
			connection = DriverManager.getConnection(Authorization.DB_URL, Authorization.USER_NAME,
					Authorization.PASSWORD);
			statement = connection.createStatement();

			sql = "select * from transaction where time_stamp = '"+java.sql.Date.valueOf(time_stamp)+"'";
			System.out.println(sql);

			resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				transactionData = new TransactionData(
						resultSet.getInt("transaction_id"),
						resultSet.getInt("account_id"),
						resultSet.getDate("time_stamp").toString(),
						resultSet.getFloat("amount"),
						resultSet.getFloat("balance"),
						resultSet.getString("description")
						);
				transactionList.add(transactionData);
			}
			sql = null;
			resultSet.close();
			statement.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("Exception : Transaction getByTimeStamp" + e.getMessage());
			return transactionList;
		} catch (Exception e) {
			System.out.println("Exception : Transaction getByTimeStamp" + e.getMessage());
			return transactionList;
		}
		return transactionList;
	}
	public static List<TransactionData> getByAmount(Float amount) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		String sql = null;
		TransactionData transactionData = null;
		List<TransactionData> transactionList = new ArrayList<TransactionData>();
		try {
			Class.forName(Authorization.JDBC_DRIVER);
			connection = DriverManager.getConnection(Authorization.DB_URL, Authorization.USER_NAME,
					Authorization.PASSWORD);
			statement = connection.createStatement();

			sql = "select * from transaction where amount = '"+amount+"'";
			System.out.println(sql);

			resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				transactionData = new TransactionData(
						resultSet.getInt("transaction_id"),
						resultSet.getInt("account_id"),
						resultSet.getDate("time_stamp").toString(),
						resultSet.getFloat("amount"),
						resultSet.getFloat("balance"),
						resultSet.getString("description")
						);
				transactionList.add(transactionData);
			}
			sql = null;
			resultSet.close();
			statement.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("Exception : Transaction getByAmount" + e.getMessage());
			return transactionList;
		} catch (Exception e) {
			System.out.println("Exception : Transaction getByAmount" + e.getMessage());
			return transactionList;
		}
		return transactionList;
	}
	public static List<TransactionData> getByBalance(Float balance) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		String sql = null;
		TransactionData transactionData = null;
		List<TransactionData> transactionList = new ArrayList<TransactionData>();
		try {
			Class.forName(Authorization.JDBC_DRIVER);
			connection = DriverManager.getConnection(Authorization.DB_URL, Authorization.USER_NAME,
					Authorization.PASSWORD);
			statement = connection.createStatement();

			sql = "select * from transaction where balance = '"+balance+"'";
			System.out.println(sql);

			resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				transactionData = new TransactionData(
						resultSet.getInt("transaction_id"),
						resultSet.getInt("account_id"),
						resultSet.getDate("time_stamp").toString(),
						resultSet.getFloat("amount"),
						resultSet.getFloat("balance"),
						resultSet.getString("description")
						);
				transactionList.add(transactionData);
			}
			sql = null;
			resultSet.close();
			statement.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("Exception : Transaction getByBalance" + e.getMessage());
			return transactionList;
		} catch (Exception e) {
			System.out.println("Exception : Transaction getByBalance" + e.getMessage());
			return transactionList;
		}
		return transactionList;
	}
	public static List<TransactionData> getByDescription(String description) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		String sql = null;
		TransactionData transactionData = null;
		List<TransactionData> transactionList = new ArrayList<TransactionData>();
		try {
			Class.forName(Authorization.JDBC_DRIVER);
			connection = DriverManager.getConnection(Authorization.DB_URL, Authorization.USER_NAME,
					Authorization.PASSWORD);
			statement = connection.createStatement();

			sql = "select * from transaction where description = '"+description+"'";
			System.out.println(sql);

			resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				transactionData = new TransactionData(
						resultSet.getInt("transaction_id"),
						resultSet.getInt("account_id"),
						resultSet.getDate("time_stamp").toString(),
						resultSet.getFloat("amount"),
						resultSet.getFloat("balance"),
						resultSet.getString("description")
						);
				transactionList.add(transactionData);
			}
			sql = null;
			resultSet.close();
			statement.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("Exception : Transaction getByDescription" + e.getMessage());
			return transactionList;
		} catch (Exception e) {
			System.out.println("Exception : Transaction getByDescription" + e.getMessage());
			return transactionList;
		}
		return transactionList;
	}
	public static List<TransactionData> getAll() {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		String sql = null;
		TransactionData transactionData = null;
		List<TransactionData> transactionList = new ArrayList<TransactionData>();
		try {
			Class.forName(Authorization.JDBC_DRIVER);
			connection = DriverManager.getConnection(Authorization.DB_URL, Authorization.USER_NAME,
					Authorization.PASSWORD);
			statement = connection.createStatement();
	
			sql = "select * from transaction";
			System.out.println(sql);
	
			resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				transactionData = new TransactionData(
						resultSet.getInt("transaction_id"),
						resultSet.getInt("account_id"),
						resultSet.getDate("time_stamp").toString(),
						resultSet.getFloat("amount"),
						resultSet.getFloat("balance"),
						resultSet.getString("description")
						);
				transactionList.add(transactionData);
			}
			sql = null;
			resultSet.close();
			statement.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("Exception : Transaction getAll" + e.getMessage());
			return transactionList;
		} catch (Exception e) {
			System.out.println("Exception : Transaction getAll" + e.getMessage());
			return transactionList;
		}
		return transactionList;
	}



}
