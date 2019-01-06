package com.lake.producer.copy.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * spring-cloud-examples
 *
 * @author Lake Fang
 * @date 2018-12-17 22:32
 */
@RestController
@RequestMapping("/producer")
public class ProducerController {
    private static final Logger LOGGER = Logger.getLogger(ProducerController.class);

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/hello")
    public String hello(@RequestParam String msg) {
        ServiceInstance instance = discoveryClient.getLocalServiceInstance();
        LOGGER.debug("producer... host:" + instance.getHost() + " server_id:" + instance.getServiceId());
        return "hello, I com from ProducerController, Hello “ " + msg + " ”";
    }
}
