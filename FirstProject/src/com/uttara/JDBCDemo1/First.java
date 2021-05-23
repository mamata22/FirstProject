package com.uttara.JDBCDemo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class First {

	public static void main(String[] args) {
		String dname="org.hsqldb.jdbcDriver";
		String url=	"jdbc:hsqldb:hsql://localhost/";
		String uid= "sa";
		String pwd="";
		
		try {
			
			
			Class.forName(dname);
			Connection con=DriverManager.getConnection(url,uid,pwd);
		} 
		catch (ClassNotFoundException |SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
