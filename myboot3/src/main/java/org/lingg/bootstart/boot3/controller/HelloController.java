package org.lingg.bootstart.boot3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Map<String, Object> map){
        map.put("hello", "你好");
        map.put("text1", "<span style='color:red;'>测试文本</span>");

        map.put("users", Arrays.asList("张三","李四","王五"));

//        private String prefix = "classpath:/templates/";
//        private String suffix = ".html";
        return "success";
    }
}
