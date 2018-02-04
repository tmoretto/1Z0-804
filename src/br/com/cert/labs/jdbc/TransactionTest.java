package br.com.cert.labs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionTest {

	public static void main(String[] args) throws SQLException {
		String dbURL = "url_db";
		
		Connection conn = DriverManager.getConnection(dbURL);
		String updateString = "UPDATE SALES set T_AMOUNT = 100 where T_NAME = `BOB`";
		Statement stmt = conn.createStatement();
		stmt.executeUpdate(updateString);
		
		conn.commit();
		conn.setAutoCommit(true);
		//conn.rollback();

	}

}
