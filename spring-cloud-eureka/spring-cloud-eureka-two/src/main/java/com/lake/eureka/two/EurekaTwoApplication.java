package com.lake.eureka.two;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <code>@EnableEurekaServer</code> 表示这是一个Eureka Server
 * @author Lake
 */
@SpringBootApplication(scanBasePackages = "com.lake.eureka.two")
@EnableEurekaServer
public class EurekaTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaTwoApplication.class, args);
	}

}