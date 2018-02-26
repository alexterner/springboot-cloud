package com.example.eureka.consumer.consumerserver.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    public static final String HELLOWORLD_API = "http://helloworld-service/api/";

    @Autowired
    private RestTemplate restTemplate;

    public String sayHello(String world) {
        return restTemplate.getForObject(HELLOWORLD_API + world, String.class);
    }

}
