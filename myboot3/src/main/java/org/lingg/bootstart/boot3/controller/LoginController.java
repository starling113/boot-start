package org.lingg.bootstart.boot3.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

    @RequestMapping("/user/login")
    public String login(
            HttpSession session,
            String username, String password,

            Map<String, Object> map) {
        System.out.println(username+"     "+password);
        if ("123456".equals(password)) {
            session.setAttribute("loginUser", username);
            return "redirect:/main.html";
        } else {
            map.put("msg", "密码错误");
            return "login";
        }
    }
}
