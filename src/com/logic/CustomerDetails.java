package com.logic;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.model.*;
import com.utilities.*;


public class CustomerDetails {
	
	public static CustomerData getByID(int customer_id) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		String sql = null;
		CustomerData customerData = null;
		try {
			Class.forName(Authorization.JDBC_DRIVER);
			connection = DriverManager.getConnection(Authorization.DB_URL, Authorization.USER_NAME,
					Authorization.PASSWORD);
			statement = connection.createStatement();

			sql = "select * from customer where customer_id = '"+customer_id+"'";
			System.out.println(sql);

			resultSet = statement.executeQuery(sql);
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
			}
			sql = null;
			resultSet.close();
			statement.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("Exception : Customer getByID" + e.getMessage());
			return customerData;
		} catch (Exception e) {
			System.out.println("Exception : Customer getByID" + e.getMessage());
			return customerData;
		}
		return customerData;
	}
	public static List<CustomerData> getByFirstName(String first_name) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		String sql = null;
		CustomerData customerData = null;
		List<CustomerData> customerList = new ArrayList<CustomerData>();
		try {
			Class.forName(Authorization.JDBC_DRIVER);
			connection = DriverManager.getConnection(Authorization.DB_URL, Authorization.USER_NAME,
					Authorization.PASSWORD);
			statement = connection.createStatement();
	
			sql = "select * from customer where first_name = '"+first_name+"'";
			System.out.println(sql);
	
			resultSet = statement.executeQuery(sql);
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
			sql = null;
			resultSet.close();
			statement.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("Exception : Customer getByFirstName" + e.getMessage());
			return customerList;
		} catch (Exception e) {
			System.out.println("Exception : Customer getByFirstName" + e.getMessage());
			return customerList;
		}
		return customerList;
	}
	public static List<CustomerData> getByLastName(String last_name) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		String sql = null;
		CustomerData customerData = null;
		List<CustomerData> customerList = new ArrayList<CustomerData>();
		try {
			Class.forName(Authorization.JDBC_DRIVER);
			connection = DriverManager.getConnection(Authorization.DB_URL, Authorization.USER_NAME,
					Authorization.PASSWORD);
			statement = connection.createStatement();
	
			sql = "select * from customer where last_name = '"+last_name+"'";
			System.out.println(sql);
	
			resultSet = statement.executeQuery(sql);
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
			sql = null;
			resultSet.close();
			statement.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("Exception : Customer getByLastName" + e.getMessage());
			return customerList;
		} catch (Exception e) {
			System.out.println("Exception : Customer getByLastName" + e.getMessage());
			return customerList;
		}
		return customerList;
	}
	public static List<CustomerData> getByMiddleName(String middle_name) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		String sql = null;
		CustomerData customerData = null;
		List<CustomerData> customerList = new ArrayList<CustomerData>();
		try {
			Class.forName(Authorization.JDBC_DRIVER);
			connection = DriverManager.getConnection(Authorization.DB_URL, Authorization.USER_NAME,
					Authorization.PASSWORD);
			statement = connection.createStatement();
	
			sql = "select * from customer where middle_name = '"+middle_name+"'";
			System.out.println(sql);
	
			resultSet = statement.executeQuery(sql);
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
			sql = null;
			resultSet.close();
			statement.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("Exception : Customer getByMiddleName" + e.getMessage());
			return customerList;
		} catch (Exception e) {
			System.out.println("Exception : Customer getByMiddleName" + e.getMessage());
			return customerList;
		}
		return customerList;
	}
	public static List<CustomerData> getByStreet(String street) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		String sql = null;
		CustomerData customerData = null;
		List<CustomerData> customerList = new ArrayList<CustomerData>();
		try {
			Class.forName(Authorization.JDBC_DRIVER);
			connection = DriverManager.getConnection(Authorization.DB_URL, Authorization.USER_NAME,
					Authorization.PASSWORD);
			statement = connection.createStatement();
	
			sql = "select * from customer where street = '"+street+"'";
			System.out.println(sql);
	
			resultSet = statement.executeQuery(sql);
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
			sql = null;
			resultSet.close();
			statement.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("Exception : Customer getByStreet" + e.getMessage());
			return customerList;
		} catch (Exception e) {
			System.out.println("Exception : Customer getByStreet" + e.getMessage());
			return customerList;
		}
		return customerList;
	}
	public static List<CustomerData> getByCity(String city) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		String sql = null;
		CustomerData customerData = null;
		List<CustomerData> customerList = new ArrayList<CustomerData>();
		try {
			Class.forName(Authorization.JDBC_DRIVER);
			connection = DriverManager.getConnection(Authorization.DB_URL, Authorization.USER_NAME,
					Authorization.PASSWORD);
			statement = connection.createStatement();
	
			sql = "select * from customer where city = '"+city+"'";
			System.out.println(sql);
	
			resultSet = statement.executeQuery(sql);
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
			sql = null;
			resultSet.close();
			statement.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("Exception : Customer getByCity" + e.getMessage());
			return customerList;
		} catch (Exception e) {
			System.out.println("Exception : Customer getByCity" + e.getMessage());
			return customerList;
		}
		return customerList;
	}
	public static List<CustomerData> getByState(String state) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		String sql = null;
		CustomerData customerData = null;
		List<CustomerData> customerList = new ArrayList<CustomerData>();
		try {
			Class.forName(Authorization.JDBC_DRIVER);
			connection = DriverManager.getConnection(Authorization.DB_URL, Authorization.USER_NAME,
					Authorization.PASSWORD);
			statement = connection.createStatement();
	
			sql = "select * from customer where state = '"+state+"'";
			System.out.println(sql);
	
			resultSet = statement.executeQuery(sql);
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
			sql = null;
			resultSet.close();
			statement.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("Exception : Customer getByState" + e.getMessage());
			return customerList;
		} catch (Exception e) {
			System.out.println("Exception : Customer getByState" + e.getMessage());
			return customerList;
		}
		return customerList;
	}
	public static List<CustomerData> getByZip(String zip) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		String sql = null;
		CustomerData customerData = null;
		List<CustomerData> customerList = new ArrayList<CustomerData>();
		try {
			Class.forName(Authorization.JDBC_DRIVER);
			connection = DriverManager.getConnection(Authorization.DB_URL, Authorization.USER_NAME,
					Authorization.PASSWORD);
			statement = connection.createStatement();
	
			sql = "select * from customer where zip = '"+zip+"'";
			System.out.println(sql);
	
			resultSet = statement.executeQuery(sql);
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
			sql = null;
			resultSet.close();
			statement.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("Exception : Customer getByZip" + e.getMessage());
			return customerList;
		} catch (Exception e) {
			System.out.println("Exception : Customer getByZip" + e.getMessage());
			return customerList;
		}
		return customerList;
	}
	public static List<CustomerData> getByPhone(String phone) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		String sql = null;
		CustomerData customerData = null;
		List<CustomerData> customerList = new ArrayList<CustomerData>();
		try {
			Class.forName(Authorization.JDBC_DRIVER);
			connection = DriverManager.getConnection(Authorization.DB_URL, Authorization.USER_NAME,
					Authorization.PASSWORD);
			statement = connection.createStatement();
	
			sql = "select * from customer where phone = '"+phone+"'";
			System.out.println(sql);
	
			resultSet = statement.executeQuery(sql);
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
			sql = null;
			resultSet.close();
			statement.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("Exception : Customer getByPhone" + e.getMessage());
			return customerList;
		} catch (Exception e) {
			System.out.println("Exception : Customer getByPhone" + e.getMessage());
			return customerList;
		}
		return customerList;
	}
	public static List<CustomerData> getByEmail(String email) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		String sql = null;
		CustomerData customerData = null;
		List<CustomerData> customerList = new ArrayList<CustomerData>();
		try {
			Class.forName(Authorization.JDBC_DRIVER);
			connection = DriverManager.getConnection(Authorization.DB_URL, Authorization.USER_NAME,
					Authorization.PASSWORD);
			statement = connection.createStatement();
	
			sql = "select * from customer where email = '"+email+"'";
			System.out.println(sql);
	
			resultSet = statement.executeQuery(sql);
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
			sql = null;
			resultSet.close();
			statement.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("Exception : Customer getByEmail" + e.getMessage());
			return customerList;
		} catch (Exception e) {
			System.out.println("Exception : Customer getByEmail" + e.getMessage());
			return customerList;
		}
		return customerList;
	}
	public static List<CustomerData> getAll() {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		String sql = null;
		CustomerData customerData = null;
		List<CustomerData> customerList = new ArrayList<CustomerData>();
		try {
			Class.forName(Authorization.JDBC_DRIVER);
			connection = DriverManager.getConnection(Authorization.DB_URL, Authorization.USER_NAME,
					Authorization.PASSWORD);
			statement = connection.createStatement();
	
			sql = "select * from customer";
			System.out.println(sql);
	
			resultSet = statement.executeQuery(sql);
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
			sql = null;
			resultSet.close();
			statement.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("Exception : Customer getAll" + e.getMessage());
			return customerList;
		} catch (Exception e) {
			System.out.println("Exception : Customer getAll" + e.getMessage());
			return customerList;
		}
		return customerList;
	}


}
