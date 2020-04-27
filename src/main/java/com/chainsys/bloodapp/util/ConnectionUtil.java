package com.chainsys.bloodapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//import com.chainsys.bloodbankapp.exception.DbException;

public class ConnectionUtil {

	public static Connection getConnection() {

		Connection connection = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "oracle");
		} catch (ClassNotFoundException e) {
			//logger.info("Connection Error Message");
		} catch (SQLException e) {
			//logger.info("SQL Error Message");
		}
		return connection;
	}

}
