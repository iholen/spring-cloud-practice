package com.iholen.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author huliang
 * @date 2019-06-24 16:11
 */
@FeignClient(value = "hello-server")
public interface HelloFeign {

    /**
     * 调用 hello-server
     *
     * @return
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    String invokeHelloServer();

}
