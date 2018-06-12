package org.lingg.bootstart.myboot1.controller;

import org.lingg.bootstart.myboot1.model.User;
import org.lingg.bootstart.myboot1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/helloUser/{userId}")
    public String show(@PathVariable Integer userId) {
        return userService.helloUserByUserId(userId);
    }

    @RequestMapping("/showAll")
    public Object showAll(@RequestParam(defaultValue = "1") int pageNum,
                          @RequestParam(defaultValue = "10") int pageSize) {
        System.out.println(pageNum);
        System.out.println(pageSize);
        return userService.listAll(pageNum, pageSize);
    }

    @RequestMapping("/addOne")
    public Object addOne(User user) {
        return userService.insert(user);
    }
}
