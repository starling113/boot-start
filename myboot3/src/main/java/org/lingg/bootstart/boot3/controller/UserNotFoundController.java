package org.lingg.bootstart.boot3.controller;

import org.lingg.bootstart.boot3.exception.UserNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserNotFoundController {

    @ResponseBody
    @RequestMapping("/ex")
    public String testException(String user){
        if("aaa".equals(user)){
            throw  new UserNotFoundException();
        }
        return "user is "+ user;
    }
}
