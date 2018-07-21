package org.lingg.starter.test.controller;

import org.lingg.springboot.starter.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    HelloService helloService;

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name){
        return helloService.sayHelloStarter(name);
    }
}
