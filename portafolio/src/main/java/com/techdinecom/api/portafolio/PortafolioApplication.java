package com.techdinecom.api.portafolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication
public class PortafolioApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortafolioApplication.class, args);
	}
	
	@Bean(name = "dataSource")
	public DriverManagerDataSource dataSource() {
	
	    DriverManagerDataSource dataSource = new DriverManagerDataSource();
	    dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	    dataSource.setUrl("jdbc:mysql://localhost:3306/apyoprogramo?serverTimezone=UTC");
	    dataSource.setUsername("root");
	    dataSource.setPassword("veblairrch");

	    return dataSource;
	}

}
