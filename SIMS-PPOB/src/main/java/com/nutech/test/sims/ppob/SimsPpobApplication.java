package com.nutech.test.sims.ppob;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class SimsPpobApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimsPpobApplication.class, args);
	}

}
