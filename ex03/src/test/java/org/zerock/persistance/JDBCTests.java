package org.zerock.persistance;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTests {
	
	static {
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void testConnection() {
		try {
			
		Connection con = null;
		
		log.info(con);
			
		DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "book_ex", "book_ex");
		}catch(SQLException e) {
			fail(e.getMessage());
		}
	}

}
