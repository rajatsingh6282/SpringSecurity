package com.product;


import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class ApicAllApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(ApicAllApplication.class, args);
	}

	@Bean
	public BasicDataSource getDataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/survey");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		dataSource.setInitialSize(2);
		System.out.println("Here Connection Done.....");
		
		return dataSource;
	}
}
