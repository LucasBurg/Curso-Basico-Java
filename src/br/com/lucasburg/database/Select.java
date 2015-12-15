package br.com.lucasburg.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select {
	
	private Connection conn;
	
	public Select(Connection conn){
		this.conn = conn;
	}
	
	public ResultSet execute(String sql) throws SQLException {
		Statement stmt = this.conn.createStatement(); 
		return stmt.executeQuery(sql);
	}
}
