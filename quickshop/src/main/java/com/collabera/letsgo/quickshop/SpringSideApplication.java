package com.collabera.letsgo.quickshop;
import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
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
	public DataSource getBasicDataSource() throws ClassNotFoundException {
		
		Class.forName("org.apache.commons.pool2.PooledObjectFactory");
		
		BasicDataSource ds = new BasicDataSource();
		
		ds.setUrl(url);
        ds.setUsername(userName);
        ds.setPassword(password);
        ds.setMinIdle(5);
        ds.setMaxIdle(10);
        ds.setMaxOpenPreparedStatements(100);
        
        return ds;
	}
	
}
