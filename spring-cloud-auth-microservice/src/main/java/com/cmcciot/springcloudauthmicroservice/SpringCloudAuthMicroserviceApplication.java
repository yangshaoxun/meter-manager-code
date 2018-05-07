package com.cmcciot.springcloudauthmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan("com.cmcciot.**")
public class SpringCloudAuthMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudAuthMicroserviceApplication.class, args);
	}
}
