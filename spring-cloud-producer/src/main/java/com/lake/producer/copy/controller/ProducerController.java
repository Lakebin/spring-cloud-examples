package com.lake.producer.copy.controller;

import org.apache.log4j.Logger;
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

    @RequestMapping("/hello")
    public String hello(@RequestParam String msg) {
        LOGGER.debug("producer...");
        return "hello, I com from ProducerController, Hello “ " + msg + " ”";
    }
}
