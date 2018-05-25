package com.logic;

import java.sql.*;

import com.database.Authorization;

public class SQLCountRows {
	public static int findTotal (String tableName) {
		Connection connection1 = null;
		Statement statement1 = null;
		ResultSet resultSet1 = null;
		String sql1 = null;
		int count = 0;
		
		try {
			Class.forName(Authorization.JDBC_DRIVER);
			connection1 = DriverManager.getConnection(
					Authorization.DB_URL,
					Authorization.USER_NAME,
					Authorization.PASSWORD);
			statement1 = connection1.createStatement();
			
			sql1 = "select count(*) as rowCount from "+tableName;
			System.out.println(sql1);
			resultSet1 = statement1.executeQuery(sql1);
			if (resultSet1.next())
				count = resultSet1.getInt("rowCount");
			
			resultSet1.close();
			statement1.close();
			connection1.close();
			
			return count;

		}catch (SQLException e) {
			System.out.println("Exception : RowCount" +e.getMessage());
			return count;
		} catch (Exception e) {
			System.out.println("Exception : RowCount" +e.getMessage());
			return count;
		}
	}

}
