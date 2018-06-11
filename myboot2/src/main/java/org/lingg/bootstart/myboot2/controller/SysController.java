package org.lingg.bootstart.myboot2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SysController {


    @GetMapping("hello")
    public String sayHellox(){
        return "hello boot";
    }

    @RequestMapping("/w")
    public String sayWelcome(){
        return "welcome";
    }
}
