package com.iholen.controller;

import com.iholen.feign.HelloFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huliang
 * @date 2019-06-24 16:19
 */
@RestController
public class FeignController {

    @Autowired
    private HelloFeign helloFeign;

    @RequestMapping(value = "/")
    public String index() {
        return helloFeign.invokeHelloServer();
    }

}
