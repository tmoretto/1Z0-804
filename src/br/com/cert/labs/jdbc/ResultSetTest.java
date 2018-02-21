package br.com.cert.labs.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void alternateViewTable(Connection con)
		    throws SQLException {

		    Statement stmt = null;
		    String query =
		        "select COF_NAME, SUP_ID, PRICE, " +
		        "SALES, TOTAL from COFFEES";

		    try {
		        stmt = con.createStatement();
		        ResultSet rs = stmt.executeQuery(query);
		        while (rs.next()) {
		            String coffeeName = rs.getString(1);
		            int supplierID = rs.getInt(2);
		            float price = rs.getFloat(3);
		            int sales = rs.getInt(4);
		            int total = rs.getInt(5);
		            System.out.println(coffeeName + "\t" + supplierID +
		                               "\t" + price + "\t" + sales +
		                               "\t" + total);
		        }
		    } catch (SQLException e ) {
		        e.printStackTrace();
		    } finally {
		        if (stmt != null) { stmt.close(); }
		    }
		}

}
