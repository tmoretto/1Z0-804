package br.com.cert.labs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Connection4 {

	public static void main(String[] args) {

	}

	
	public Connection getConnection1(String url, String user, String pwd) throws SQLException {
		Properties p = new Properties();
		p.setProperty("user", user);
		p.setProperty("password", pwd);
		return DriverManager.getConnection(url, p);
	}
	
	public Connection getConnection2(String url, String user, String pwd) throws SQLException {
		return DriverManager.getConnection(url, user, pwd);
	}
}
