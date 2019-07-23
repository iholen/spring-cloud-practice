package com.iholen.controller;

import com.iholen.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huliang
 * @date 2019-06-24 14:22
 */
@RestController
public class RibbonController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/")
    public String index() {
        return helloService.invokeHelloServer();
    }
}
