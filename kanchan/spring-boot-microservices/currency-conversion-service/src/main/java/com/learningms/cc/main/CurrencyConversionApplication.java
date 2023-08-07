package com.learningms.cc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients("com.learningms.cc.proxy")
@SpringBootApplication//(scanBasePackages = "com.learningms.cc")
public class CurrencyConversionApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConversionApplication.class, args);
	}

}
