package com.collabera.letsgo.quickshop.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Optional;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.collabera.letsgo.quickshop.model.User;

@Repository
public class UserRepository {
	
	@Autowired
	DataSource ds;

	
	public Optional<User> getByID(long id) throws SQLException {
		Connection conn = ds.getConnection();
		String query = "select * from user where user.user_id = "+id;
	    Statement stmt = conn.createStatement();
	    
		ResultSet rs = stmt.executeQuery(query);
		if(!rs.next()) {
			return Optional.empty();
		}
		User user = new User(rs);
	    System.out.println(user.toString());
		
	    conn.close();
	    
		return Optional.of(user);
	}
}
