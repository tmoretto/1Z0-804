package br.com.cert.labs.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateResultSet {

	static final String dbName = "db"; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void modifyPrices(Connection con, float percentage) throws SQLException {

	    Statement stmt = null;
	    try {
	        stmt = con.createStatement();
	        stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
	                   ResultSet.CONCUR_UPDATABLE);
	        ResultSet uprs = stmt.executeQuery(
	            "SELECT * FROM " + dbName + ".COFFEES");

	        while (uprs.next()) {
	            float f = uprs.getFloat("PRICE");
	            uprs.updateFloat( "PRICE", f * percentage);
	            uprs.updateRow();
	        }

	    } catch (SQLException e ) {
	        e.printStackTrace();
	    } finally {
	        if (stmt != null) { stmt.close(); }
	    }
	}

}
