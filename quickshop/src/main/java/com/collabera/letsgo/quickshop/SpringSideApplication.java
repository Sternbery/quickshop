package com.collabera.letsgo.quickshop;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringSideApplication {

	@Value("${spring.datasource.username}")
	String userName;
	
	@Value("${spring.datasource.password}")
	String password;
	
	@Value("${spring.datasource.url}")
	String url;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringSideApplication.class, args);
	}

	@Bean
	public Connection connection() throws SQLException, ClassNotFoundException {

		//Class.forName("com.mysql.jdbc.Driver");
		
	    Connection conn = null;
	    Properties props = new Properties();
	    props.put("user", this.userName);
	    props.put("password", this.password);
        conn = DriverManager.getConnection(this.url, props);
	    
	    System.out.println("Connected to database");
	    return conn;
	}
	
}
