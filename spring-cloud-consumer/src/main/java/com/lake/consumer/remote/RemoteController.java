package com.lake.consumer.remote;

import com.lake.consumer.hystrix.RemoteHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Write class comments here
 * <p>
 * User: Lake
 * Date: 2018/12/18 12:21
 * version $Id: RemoteController.java, v 0.1  12:21 Exp $
 */
@FeignClient(name = "spring-cloud-producer", fallback = RemoteHystrix.class)
public interface RemoteController {

	@RequestMapping(value = "/producer/hello")
	String hello (@RequestParam(value = "msg") String msg);
}
