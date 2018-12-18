package com.lake.consumer.controller;

import com.lake.consumer.remote.RemoteController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Write class comments here
 * <p>
 * User: Lake
 * Date: 2018/12/18 12:24
 * version $Id: ConsumerController.java, v 0.1  12:24 Exp $
 */
@RestController
@RequestMapping(value = "/consumer")
public class ConsumerController {
	@Autowired
	private RemoteController remoteController;

	@RequestMapping("/hello/{msg}")
	public String hello(@PathVariable(value = "msg") String msg) {
		return remoteController.hello (msg);
	}
}
