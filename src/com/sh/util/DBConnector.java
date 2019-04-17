package com.sh.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnector {
	
	public void dbConnector() throws Exception{
		//1, 2, 3번 
		String user = "user01";
		String password = "user01";
		String url = "jdbc:oracle:thin:@211.238.142.30:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		Class.forName(driver);
		
		Connection conn = DriverManager.getConnection(url, user, password);
		
	}

}
