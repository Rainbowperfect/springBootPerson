package org.person.controller;

import org.person.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Autowired
    private User user;

    @ResponseBody
    @RequestMapping("Hello")
    public User sayHi(){

        return  user;
    }
}
