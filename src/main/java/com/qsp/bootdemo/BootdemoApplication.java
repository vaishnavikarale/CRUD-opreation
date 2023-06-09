package com.qsp.bootdemo;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages ="com.qsp.bootdemo.controller" )
@EntityScan(basePackages = "com.qsp.bootdemo.dto")
@EnableJpaRepositories(basePackages = "com.qsp.bootdemo.repository")

public class BootdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootdemoApplication.class, args);
		
	}

}
