package com.iholen.service.impl;

import com.iholen.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author huliang
 * @date 2019-06-24 14:22
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String invokeHelloServer() {
        return restTemplate.getForObject("http://HELLO-SERVER", String.class);
    }
}
