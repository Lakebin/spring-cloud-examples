package com.lake.consumer.hystrix;

import com.lake.consumer.remote.RemoteController;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 熔断器
 *
 * @author Lake Fang
 * @date 2018-12-18 19:54
 */
@Component
public class RemoteHystrix implements RemoteController {
    @Override
    public String hello(@RequestParam(value = "msg") String msg) {
        return "hello " + msg + ", this message send failed ";
    }
}
