package com.lake.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * spring-cloud-examples
 *
 * @author Lake Fang
 * @date 2018-12-17 22:05
 */
@SpringBootApplication(scanBasePackages = "com.lake.consumer")
@EnableDiscoveryClient
@EnableFeignClients
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

}
