package org.lingg.bootstart.boot3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class LoginController {

    @RequestMapping("/user/login")
    public String login(String username, String password,

                        Map<String,Object> map){
        System.out.println(username);
        System.out.println(password);
        if("123456".equals(password)) {

            return "redirect:/main.html";
        }else {
            map.put("msg", "密码错误");
            return "login";
        }
    }
}
